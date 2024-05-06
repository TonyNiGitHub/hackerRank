package com.hackerrank.java;

import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class SolutionJavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code heresui
        Locale indiaLocale = new Locale("en", "INDIA");
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(indiaLocale);
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(new Locale("en", "INDIA"));
        decimalFormatSymbols.setCurrencySymbol("Rs.");
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String india = decimalFormat.format(payment);

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
