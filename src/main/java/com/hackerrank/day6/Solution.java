package com.hackerrank.day6;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print out to STDOUT. Your class should be named Solution */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String s[] = new String[t];
        for (int i = 0; i < t; i ++) {
            s[i] = scanner.next();
        }
        scanner.close();
        for (int i = 0; i < t; i ++) {
            StringBuffer oddChars = new StringBuffer();
            StringBuffer evenChars = new StringBuffer();
            for (int j = 0; j < s[i].length(); j ++) {
                if (j % 2 == 0)
                    evenChars.append(s[i].charAt(j));
                else
                    oddChars.append(s[i].charAt(j));
            }
            System.out.println(evenChars + " " + oddChars);
        }
    }
}
