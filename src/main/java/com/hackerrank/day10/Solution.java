package com.hackerrank.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Binary Numbers
 */
public class Solution {

    public static int count = 0;
    public static int maxCount = 0;

    public static void countOne(int n) {
        if (n <= 1) {
            count ++;
            if (count > maxCount)
                maxCount = count;
            return;
        }
        if (n % 2 == 0) {
            count = 0;
            countOne(n / 2);
        }
        else {
            count ++;
            if (count > maxCount)
                maxCount = count;
            countOne((n - 1)/2);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        countOne(n);
        bufferedReader.close();
        System.out.println("result = " + maxCount);
    }
}
