package com.test.interview;
import java.util.*;
public class Solution {

    public String serialize(TreeNode root)
    {
        if(root == null)
            return null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        List<String> list = new ArrayList<>();
        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            if(temp == null)
                list.add("#");
            else {
                list.add("" + temp.getData());
                stack.push(temp.getRight());
                stack.push(temp.getLeft());
            }
        }

       return String.join(",",list);
    }
    static int t =0;
    public TreeNode deserialize(String data)
    {
        if(data == null)
            return null;
        String[] arr = data.split(",");
        return construct(arr);
    }

    public TreeNode construct(String[] arr)
    {
        if(arr[t].equals("#"))
            return null;
            TreeNode root = new TreeNode(Integer.parseInt(arr[t]));
            t++;
            root.setLeft(construct(arr));
            t++;
            root.setRight(construct(arr));
            return root;


    }

    public void inOrder(TreeNode root)
    {
        if(root!=null)
        {
          inOrder(root.getLeft());
          System.out.print(root.getData()+" ");
          inOrder(root.getRight());
        }
    }
}
class SolutionMain
{
   public static void main(String[] args)
   {
     Solution solution = new Solution();
     TreeNode root = new TreeNode(20);
     root.setLeft(new TreeNode(8));
     root.setRight(new TreeNode(22));
     root.getLeft().setLeft(new TreeNode(4));
     root.getLeft().setRight(new TreeNode(12));
     root.getRight().setLeft(new TreeNode(10));
     root.getRight().setRight(new TreeNode(14));

    String result = solution.serialize(root);

    System.out.println(result);
    TreeNode res=solution.deserialize(result);
    solution.inOrder(res);
   }



}