package com.tree;

public class TreeMain {

    public static void main(String[] args)
    {
        Node root = new Node(50);
        root.setLeft(new Node(30));
        root.setRight(new Node(70));
        root.getLeft().setLeft(new Node(20));
        root.getLeft().setRight(new Node(40));
        root.getRight().setLeft(new Node(60));
        root.getRight().setRight(new Node(80));
        /*BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.inorderTraversal(root);
        System.out.println();
        binaryTree.deleteNode(root,20);
        binaryTree.inorderTraversal(root);
        System.out.println();
        System.out.println(binaryTree.findMinimum(root));*/
        VerticalTree verticalTree = new VerticalTree();
        verticalTree.printVerticalTree(root);


    }
}
