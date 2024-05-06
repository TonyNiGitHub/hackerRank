package com.hackerrank.day15;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {

    public static Node insert(Node head, int data) {
        // complete this method
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = new Node(data);
            Node next = head;
            while (next.next != null)
                next = next.next;
            next.next = node;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int N = scanner.nextInt();
        while (N --> 0) {
            int element = scanner.nextInt();
            // this is a bad sample code provided by HackerRank and can not be modified.
            head = insert(head, element);
        }
        display(head);
        scanner.close();
    }
}
