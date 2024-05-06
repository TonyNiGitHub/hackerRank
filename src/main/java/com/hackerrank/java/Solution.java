package com.hackerrank.java;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        int x = 0;
        System.out.println("=======================");
        for (int i = 0; i < 3; i ++) {
            s1 = scanner.next();
            x = scanner.nextInt();
            System.out.println(String.format("%-15s", s1) + " = " + String.format("%03d", x));
        }
        System.out.println("=======================");
        scanner.close();
    }
}
