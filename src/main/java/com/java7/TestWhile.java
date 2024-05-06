package com.java7;

public class TestWhile {

    public static void main(String args[]) {

        int i = 8;
        while (i --> 0)
            // displays 7, 6, 5, 4, 3, 2, 1, 0
            // 8 WON"T be displayed
            System.out.println("i = " + i);
    }
}
