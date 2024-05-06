package com.hackerrank.java;

import java.util.*;

/**
 * Lexicographical Order, also known as alphabetic or dictionary order
 * A < B < ... < Y < Z < a < b < ... < y < z
 */

public class SolutionJavaSubStringComparisons {

    public static String getSmallestAndLargest1(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int i =  0; i < s.length() - k + 1; i ++) {
            if (i == 0) {
                smallest = s.substring(0, k);
                largest = smallest;
            }
            else {
                String sub = s.substring(i, i + k);
                if (smallest.compareTo(sub) > 0)
                    smallest = sub;
                if (largest.compareTo(sub) < 0)
                    largest = sub;
            }
        }
        return smallest + "\n" + largest;
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length() - k + 1; i ++)
        {
            String sub = s.substring(i, i + k);
            list.add(sub);

        }
        Collections.sort(list);

/*
        class myComparator implements Comparator<String> {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };
        Collections.sort(list, new myComparator());
*/
//        for (int i = 0; i < list.size(); i ++
//           System.out.println(list.get(i));
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = list.get(0);
        largest  = list.get(list.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(getSmallestAndLargest1(s, k));

        // String str =  new String("Welcome to geeksforgeeks");
        // System.out.println(str.substring(10, 16));
    }
}
