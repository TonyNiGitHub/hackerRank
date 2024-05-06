package com.hackerrank.java;

import java.util.Scanner;

public class SolutionJavaStaticInitializerBlock {

    public static int B = 0;
    public static int H = 0;

    public static boolean flag = false;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();

        H = scanner.nextInt();
        if (B > 0 && B <= 100 && H > 0 && H <= 100) {
            flag = true;
        }
        else
            try {scanner.close();;
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        scanner.close();;
    }


    public static void main(String[] args) throws Exception {
        if (flag) {
            int area = B*H;
            System.out.println(area);
        }
    } // end of main
} // end of clas
