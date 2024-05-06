package com.hackerrank.java;

import java.util.Scanner;

/**
 * A byte is a 8-bit signed integer
 * A short is a 16-bit signed integer
 * A int is a 32-bit signed integer
 * A long is a 64-bit signed integer
 * Given an input integer, you must determine which primitive data types are capable of properly shoring that input.
 */
public class SolutionJavaDataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long i1 = (long)Math.pow(2, 7); System.out.println("byte = " + i1); // >=-128. < 128
        long j1 = (long)Math.pow(2, 15); System.out.println("short = " + j1); // >= -32768, < 32768
        long k1 = (long)Math.pow(2, 31); System.out.println("int = " + k1); // > -2147483648, < 2147483648128
        long l1 = (long)Math.pow(2, 63); System.out.println("long = " + l1); // 9223372036854775807
        byte b1 = -128, b2 = 127;
        System.out.println("b1 = " + b1 + ", b2 = " + b2);


        long byteType = (long)Math.pow(2, 8 - 1);
        long shortType = (long)Math.pow(2, 16 - 1);
        long intType = (long)Math.pow(2, 32 - 1);
        long longType = (long)Math.pow(2, 64 - 1);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i ++) {
            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -byteType && x < byteType)
                    System.out.println("* byte");
                // Complete the code
                else if (x >= -shortType && x < shortType)
                    System.out.println("* short");
                else if (x >= -intType && x < intType)
                    System.out.println("* int");
                else if (x >= -longType && x < longType)
                    System.out.println("* long");
            }
            catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere");
            }
        }
    }
}
