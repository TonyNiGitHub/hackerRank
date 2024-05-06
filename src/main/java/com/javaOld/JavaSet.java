package com.javaOld;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {
    public static void main(String args[]) {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println("size = " + set.size()); // = 2

        int n = 36;
        for (int i = 1; i <= Math.sqrt(n); i ++)
        {
            if (n % i == 0)
                System.out.println("value = " + i);
        }
    }
}
