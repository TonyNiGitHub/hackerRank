package com.hackerrank.day17;

import java.util.Scanner;

// Write your code here
class Calculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        return (int) Math.pow(n, p);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t --> 0) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            Calculator calculator = new Calculator();
            try {
                int answer = calculator.power(n, p);
                System.out.println(answer);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
