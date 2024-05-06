package com.hackerrank.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] arrTemp = bufferedReader.readLine().replace("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i ++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
            System.out.println("value = " + arrItem);
        }
        bufferedReader.close();

        for (int i = n - 1; i >= 0; i --) {
            System.out.print(arr.get(i));
            if (i != 0)
                System.out.print(" ");
        }
    }
}
