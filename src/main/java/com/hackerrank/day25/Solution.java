package com.hackerrank.day25;

import java.util.Scanner;

public class Solution {

    /* Enter your code here */

    /**
     * number 1 is not a prime
     * @param v
     * @return
     */
    public static boolean isPrime(long v) {
        if (v == 1)
            return false;
        long sq = (long) Math.sqrt(v);
        for (long i = 2; i <= sq; i ++)
            if (v % i == 0)
                return false;
        return true;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i ++) {
            long p = scanner.nextLong();
            System.out.println(p + " is " + (isPrime(p) ? "Prime" : "Not prime"));
        }
        scanner.close();
    }
}
