package com.hackerrank.day8;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Dictionaries and Maps
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i ++) {
            String name = scanner.next();
            int phone = scanner.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while (scanner.hasNext()) {
            String s = scanner.next();
            // Write code here
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
