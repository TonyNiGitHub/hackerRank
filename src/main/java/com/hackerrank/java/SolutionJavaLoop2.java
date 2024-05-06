package com.hackerrank.java;

import java.util.Scanner;

public class SolutionJavaLoop2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i ++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j ++) {
                a += b * (int)Math.pow(2, j);
                System.out.print(a);
                if (j < n - 1)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
        scanner.close();

    }
}
