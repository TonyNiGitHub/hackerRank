package com.hackerrank.java;

import java.util.Scanner;

public class SolutionJavaEndOfFile {

    public static void main(String args[]) {
        /* Enter your code here. Read input from STDIN, Print out to STDOUT. Your class should be named Solution */
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(i ++ + " " + s);
        }
    }
}
