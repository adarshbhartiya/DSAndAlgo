package com.tree;

public class DiameterTree {

    static class Node
    {
      int data;
      Node left;
      Node right;


      public Node(int x)
      {
          data=x;
      }

    }

    public int findDiameter(Node node)
    {
        int lheight = findHeightLeft(node.left);
        int rheight = findHeightRight(node.right);

        return lheight+rheight+1;
    }
    private int findHeightRight(Node node) {
        if(node == null)
            return 0;
        int lheight = findHeightLeft(node.left);
        int rheight = findHeightRight(node.right);

        if(lheight > rheight)
            return(lheight+1);
        else
            return(rheight+1);
    }

    private int findHeightLeft(Node node) {

        if(node == null)
            return 0;
        return 1+findHeightLeft(node.left);
    }


}

class DiameterMain
{

    public static void main(String[] args)
    {
      DiameterTree.Node root = new DiameterTree.Node(5);
      root.left = new DiameterTree.Node(3);
      root.right = new DiameterTree.Node(9);
      root.left.left = new DiameterTree.Node(1);
      root.left.right = new DiameterTree.Node(2);
      root.right.left = new DiameterTree.Node(7);
      root.right.right = new DiameterTree.Node(10);
      root.right.left.left = new DiameterTree.Node(6);
      root.right.left.right = new DiameterTree.Node(8);
      DiameterTree dt = new DiameterTree();
      System.out.println(dt.findDiameter(root));



    }


}
