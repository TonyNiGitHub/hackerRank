package com.hackerrank.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for (int i = 0; i < 6; i ++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<Integer>();
            for (int j = 0; j < 6; j ++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        bufferedReader.close();

        // display
        System.out.println("display :");
        for (int i = 0; i < 6; i ++) {
            List<Integer> arrRowItems = arr.get(i);
            for (int j = 0; j < 6; j++) {
                System.out.print(arrRowItems.get(j) + " ");
            }
            System.out.println();
        }
        // calculate
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {
                int count = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                count += arr.get(i + 1).get(j + 1);
                count += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (count > maxCount)
                    maxCount = count;
            }
        }
        System.out.println("max count = " + maxCount);

    }
}
