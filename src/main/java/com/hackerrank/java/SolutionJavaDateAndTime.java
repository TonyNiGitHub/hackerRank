package com.hackerrank.java;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

class Result {
    /**
     * Complete the 'findDay' function below.
     * <p>
     * The function is expected to return a String
     * The function accepts following parameters:
     * 1. INTEGER month
     * 2. INTEGER day
     * 3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] weekDays = new DateFormatSymbols().getWeekdays();

        return weekDays[dayOfWeek].toUpperCase();
    }
}

public class SolutionJavaDateAndTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        String res =Result.findDay(month, day, year);
        System.out.println(res);
    }
}
