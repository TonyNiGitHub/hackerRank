package com.hackerrank.day1;

import java.util.Scanner;

public class Solution {

    public static void main (String args[]) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int ii;
        double dd;
        String ss;

        /* Read and save an integer, double, and String to your variables */
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        Scanner scanner = new Scanner(System.in);
        ii = scanner.nextInt();
        dd = scanner.nextDouble();
        scanner.nextLine();
        ss = scanner.nextLine();
        scanner.close();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + ii);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + dd);
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first */
        System.out.println(s + ss);
    }
}
