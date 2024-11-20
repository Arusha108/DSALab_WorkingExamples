/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask06;

/**
 *
 * @author HP
 */
// LinkedList Class
class LinkedList {
    private Node top; // Pointer to the top of the stack

    // Node class representing each element in the LinkedList
    public static class Node {
        public int data;
        public Node next; // Used to link to the next node

        // Constructor to initialize a node with data
        public Node(int data) {
            this.data = data;
            this.next = null; // Default next is null
        }
    }

    // Method to insert a node at the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = top; // Link the new node to the current top
        top = newNode; // Update top to the new node
    }

    // Method to delete the first node and return it
    public Node deleteFirst() {
        if (top == null) { // If the list is empty
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        Node temp = top; // Store the current top node
        top = top.next; // Update top to the next node
        return temp; // Return the deleted node
    }

    // Method to display all nodes in the list
    public void displayList() {
        if (top == null) { // If the list is empty
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top; // Start from the top node
        while (current != null) { // Traverse the list
            System.out.println(current.data); // Print node data
            current = current.next; // Move to the next node
        }
    }
}

// LinkedListStack Class - Implements a stack using LinkedList
class LinkedListStack {
    private LinkedList li = new LinkedList(); // Use LinkedList for stack operations

    // Method to push an element onto the stack
    public void push(int element) {
        li.insertFirst(element);
    }

    // Method to pop an element from the stack
    public void pop() {
        LinkedList.Node removedNode = li.deleteFirst();
        if (removedNode == null) { // If no node was removed
            // Error message is already handled in deleteFirst()
        }
    }

    // Method to display the stack elements
    public void displayStack() {
        System.out.println("Stack elements:");
        li.displayList();
    }
}

// Main Client Class - Tests the LinkedListStack
public class LLStackClient {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack(); // Create a stack instance

        // Push elements onto the stack
        stack.push(50);
        stack.push(70);
        stack.push(190);
        System.out.println("1. Stack after push operation:");
        stack.displayStack();

        // Pop an element from the stack
        System.out.println("\n2. Stack after pop operation:");
        stack.pop();
        stack.displayStack();
    }
}
