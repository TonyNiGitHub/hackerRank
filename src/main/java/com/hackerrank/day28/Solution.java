package com.hackerrank.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String arg[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < N; i ++) {
            String info = bufferedReader.readLine();
            String[] firstMultipleInput = info.replaceAll("\\s+$", "").split(" ");
            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];
            if (emailID.endsWith("@gmail.com")) {
                list.add(firstName);
            }
        }
        bufferedReader.close();
        Collections.sort(list);
        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }
}
