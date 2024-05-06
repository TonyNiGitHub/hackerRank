package com.hackerrank.day24;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class Solution {

    public static Node removeDuplicate(Node head) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        set.add(head.data);

        Node node = head;
        while(node.next != null) {
            Node next = node.next;

            if (!set.add(next.data))
                node.next = next.next;
            else
                node = node.next;
        }
        return head;
    }

    public static Node insert(Node head, int data) {

        Node node = new Node(data);

        if (head == null)
            head = node;
        else if (head.next == null)
            head.next = node;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = node;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.println(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int T = scanner.nextInt();
        while (T --> 0) {
            int element = scanner.nextInt();
            head = insert(head, element);
        }
        head = removeDuplicate(head);
        display(head);
    }
}
