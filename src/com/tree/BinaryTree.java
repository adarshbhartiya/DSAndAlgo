package com.tree;


public class BinaryTree {

     private Node root;

     public BinaryTree(Node root)
     {
         this.root = root;
     }
     public void inorderTraversal(Node temp)
      {
        if(temp == null)
            System.out.println("No Nodes in the tree");
        if(temp.getLeft()!=null) {
             inorderTraversal(temp.getLeft());
        }
        System.out.print(temp.getData() + " ");
        if(temp.getRight()!=null) {
            inorderTraversal(temp.getRight());
        }
      }

      public void preOrderTraversal(Node temp)
      {
        if(temp == null)
            System.out.println("No nodes in the tree");
        System.out.print(temp.getData()+ " ");
        if(temp.getLeft()!=null)
            preOrderTraversal(temp.getLeft());
        if(temp.getRight()!=null)
            preOrderTraversal(temp.getRight());
      }

      public void postOrderTraversal(Node temp)
      {
          if(temp == null)
              System.out.println("No nodes in the tree");
          if(temp.getLeft()!=null)
             postOrderTraversal(temp.getLeft());
          if(temp.getRight()!=null)
              postOrderTraversal(temp.getRight());
          System.out.print(temp.getData()+" ");


      }

      public void levelOrderTraversal(Node temp,int level)
      {

          if(temp == null)
              return;
          if(level == 1)
              System.out.print(temp.getData()+" ");
          if(level > 1) {
              levelOrderTraversal(temp.getLeft(), level - 1);
              levelOrderTraversal(temp.getRight(), level - 1);
          }

      }

      public void printLevelOrderTraversal(Node temp)
      {
         int h = height(temp);
         for(int i=1;i<=h;i++)
         {
            levelOrderTraversal(temp,i);
         }

      }

      public int height(Node temp)
      {
          if(temp == null)
              return 0;
          int lheight = height(temp.getLeft());
          int rheight = height(temp.getRight());

          if(lheight > rheight)
              return lheight+1;
          else
              return rheight+1;
      }


      public void binarySearch(Node root,int key)
      {
         if(root == null)
             return;
         if(root!= null && key == root.getData())
             System.out.println("key is present");
         if(key > root.getData())
             binarySearch(root.getRight(),key);
         else
             binarySearch(root.getLeft(),key);
      }

    /**
     * this method works in case of binary search tree only as the elements of the right subtree should be greater than the
     * elements of the left subtree.
     */
    public void insertNode(Node root,int key)
    {

        if(root.getLeft() == null && key < root.getData())
            root.setLeft(new Node(key));
        if(root.getRight() == null && key > root.getData())
            root.setRight(new Node(key));

        if(key > root.getData())
            insertNode(root.getRight(),key);
        if(key < root.getData())
            insertNode(root.getLeft(),key);
    }
    public Node deleteNode(Node root,int key)
    {
       if(root == null)
           return root;
       if(key < root.getData())
            root.setLeft(deleteNode(root.getLeft(),key));
        else if(key > root.getData())
            root.setRight(deleteNode(root.getRight(),key));
       else {
           if (root.getLeft() == null)
               return root.getRight();
           if (root.getRight() == null)
               return root.getLeft();
           int data = findMinimum(root.getRight());
           root.setData(data);
           root.setRight(deleteNode(root.getRight(), data));
       }
        return root;
    }

    public int findMinimum(Node temp)
    {
      if(temp.getLeft() == null && temp.getRight() == null)
          return temp.getData();
      if(temp.getLeft() == null)
          return temp.getData();
      return findMinimum(temp.getLeft());
    }
}

