package com.hackerrank.java;

import java.util.Scanner;

public class SolutionJavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        /* Enter your code here. Print out to STDOUT */
        System.out.println(A.length() + B.length());
        System.out.println(A.charAt(0) > B.charAt(0)? "Yes" : "No");
        System.out.println(A.substring(0, 1).toUpperCase()+ A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
