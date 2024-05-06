package com.hackerrank.java;

import java.util.Scanner;

public class SolutionJavaStringReverse {

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        /* Enter your code here. Print output to STDOUT */
        StringBuilder B = new StringBuilder();
        B.append(A);
        B.reverse();

        System.out.println(A.equals(B.toString()));
    }
}
