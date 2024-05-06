package com.hackerrank.day22;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class Solution {

    public static int getHeight(String path, Node root) {
        // Write your code here

        // Base case: if the tree is empty, return -1
        if (root == null)
            return -1;

        // Recursive case: compute the depth of each subtree
        int leftHeight = getHeight("left", root.left);
        int rightHeight = getHeight("right", root.right);

        // Use the larger one and add the root to it
        return leftHeight > rightHeight? leftHeight + 1 : rightHeight + 1;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        else {
            Node current;
            if (data <= root.data) {
                current = insert(root.left, data);
                root.left = current;
            }
            else {
                current = insert(root.right, data);
                root.right = current;
            }
            return root;
        }
    }

    public static void main(String args[]) {

        /*
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        Node root = null;
        while(T --> 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }

         */
        // int[] a = {3, 5, 2, 1, 4, 6, 7};
        int[] a = {3, 5, 4, 7, 2, 1};
        Node root = null;
        for (int i = 0; i < a.length; i ++) {
            root = insert(root, a[i]);
        }
        int height = getHeight("first", root);
        System.out.println(height);
    }
}
