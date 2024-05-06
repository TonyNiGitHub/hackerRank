package com.hackerrank.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        // Write your code here by using Bubble Sort
        for (int i = 0; i < a.size(); i ++) {
            for (int j = 0; j < a.size() - 1; j ++) {
                if (a.get(j) < a.get(j + 1)) {
                    Integer tmp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, tmp);
                }
            }
        }
/*
        class myComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer a, Integer b) {
                return b.intValue() - a.intValue();
            }
        };
        Collections.sort(a, new myComparator());
 */
        for (int i = 0; i < a.size(); i ++)
            System.out.println(a.get(i));
        bufferedReader.close();
    }
}
