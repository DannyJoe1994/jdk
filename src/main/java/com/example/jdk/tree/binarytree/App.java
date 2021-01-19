package com.example.jdk.tree.binarytree;

public class App {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new Node(5);
        binaryTree.addNode(3);
        binaryTree.addNode(4);
        binaryTree.addNode(8);
        binaryTree.addNode(7);

        System.out.println(binaryTree.root.right.left.data);

        System.out.println("先序遍历：");
        preTraverse(binaryTree.root);

        System.out.println();
        System.out.println("中序遍历：");
        midTraverse(binaryTree.root);

        System.out.println();
        System.out.println("后序遍历：");
        afterTraverse(binaryTree.root);

    }


    public static void preTraverse(Node root) {

        if (root != null) {
            System.out.print(root.data);
            preTraverse(root.left);
            preTraverse(root.right);
        }
    }

    public static void midTraverse(Node root) {

        if (root != null) {
            midTraverse(root.left);
            System.out.print(root.data);
            midTraverse(root.right);
        }
    }

    public static void afterTraverse(Node root) {

        if (root != null) {
            afterTraverse(root.left);
            afterTraverse(root.right);
            System.out.print(root.data);
        }
    }
}
