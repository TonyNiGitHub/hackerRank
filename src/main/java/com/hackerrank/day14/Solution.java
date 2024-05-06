package com.hackerrank.day14;

import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }
    // Add your code here
    public void computeDifference() {
        int min = elements[0];
        int max = elements[0];
        for (int i = 0; i < elements.length; i ++) {
            if (elements[i] < min) min = elements[i];
            if (elements[i] > max) max = elements[i];
        }
        maximumDifference = Math.abs(max - min);
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i ++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.println(difference.maximumDifference);
    }
}
