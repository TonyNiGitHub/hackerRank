package com.hackerrank.day26;

import java.util.Calendar;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        Scanner scanner = new Scanner(System.in);

        int act_day = scanner.nextInt();
        int act_month = scanner.nextInt();
        int act_year = scanner.nextInt();
        int exp_day = scanner.nextInt();
        int exp_month = scanner.nextInt();
        int exp_year = scanner.nextInt();
        scanner.close();

        Calendar actualDate = Calendar.getInstance();
        actualDate.clear();
        actualDate.set(act_year, act_month, act_day);

        Calendar expectedDate = Calendar.getInstance();
        expectedDate.clear();
        expectedDate.set(exp_year, exp_month, exp_day);

        long days = (actualDate.getTimeInMillis() - expectedDate.getTimeInMillis())/(24 * 60 * 60 *1000);

System.out.println("total days = "+ days);

        long fine = 0;
        // case 1: if the book is returned on or before the expected date
        if (days > 0) {
            // case 2: if the book is returned after the expected day but still within the same calendar month and year as the expected return date
            if (act_month == exp_month && act_year == exp_year)
                fine = 15 * days;
            // case 3: if the book is returned after the expected return month but still within the same calendar year as expected return date
            else if (act_year == exp_year)
                fine = 500 * (act_month - exp_month);
            // case 4: if the book is returned after the calendar year in which it was expected
            else
                fine = 10000;
        }
        System.out.println(fine);
    }
}
