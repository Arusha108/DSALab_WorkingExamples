/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author HP
 */
class Node {
    int key;
    Node left, right;

    // Constructor
    public Node(int item) {
        this.key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    // Pre-order traversal
    void printPreorder(Node node) {
        if (node == null) return;

        // First print data of node
        System.out.print(node.key + " ");

        // Then recur on left subtree
        printPreorder(node.left);

        // Now recur on right subtree
        printPreorder(node.right);
    }

    // In-order traversal
    void printInorder(Node node) {
        if (node == null) return;

        // First recur on left child
        printInorder(node.left);

        // Then print the data of node
        System.out.print(node.key + " ");

        // Now recur on right child
        printInorder(node.right);
    }

    // Post-order traversal
    void printPostorder(Node node) {
        if (node == null) return;

        // First recur on left subtree
        printPostorder(node.left);

        // Then recur on right subtree
        printPostorder(node.right);

        // Now deal with the node
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create root
        tree.root = new Node(1);
        Node a = new Node(2);
        tree.root.left = a;
        Node b = new Node(3);
        tree.root.right = b;
        a.left = new Node(4);
        a.right = new Node(5);

        // Traversals
        System.out.println("Pre-Order:");
        tree.printPreorder(tree.root);

        System.out.println("\nPost-Order:");
        tree.printPostorder(tree.root);

        System.out.println("\nIn-Order:");
        tree.printInorder(tree.root);
    }
}


