package com.example.jdk.tree.binarytree;

public class BinaryTree {

    Node root;

    private Node addNode(Node current, int val) {

        if (current == null) {
            return new Node(val);
        }

        if (val < current.data) {
            current.left = addNode(current.left, val);
        } else if (val > current.data) {
            current.right = addNode(current.right, val);
        } else {
            return current;
        }
        return current;
    }

    public Node addNode(int val) {

        return addNode(root, val);
    }
}
