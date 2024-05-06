package com.hackerrank.day19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

   Set<Integer> set = new HashSet<Integer>();
    @Override
    public int divisorSum(int n) {

        int count = 0;
        for (int i = 1; i <= n; i ++)
            if (n % i == 0)
                set.add(i);
        for (Integer c: set) {
            count+= c;
        }
        return count;
    }
}
public class Solution {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
