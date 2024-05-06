package com.hackerrank.day23;

import java.util.LinkedList;
import java.util.Queue;
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

    static void levelOrder(Node root) {
        // Write your code here
        Queue<Node> queue = new LinkedList<Node>();

        if (root != null) {
            queue.add(root);
        }
        while(!queue.isEmpty()) {
            Node tree = queue.poll();
            System.out.println(tree.data + " ");

            if (tree.left != null)
                queue.add(tree.left);
            if (tree.right != null)
                queue.add(tree.right);

        }
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
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }

}
