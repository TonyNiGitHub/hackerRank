package com.hackerrank.day4;

import java.util.Scanner;

public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        age = initialAge;
        if (age < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        System.out.println(age < 13? "You are young." : (age >= 13 && age < 18? "You are a teenager." : "You are old."));
    }

    public void yearPasses() {
        // Increment this person's age
        age ++;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("get the count:");
        int T = sc.nextInt();
        for (int i = 0; i < T; i ++) {
            System.out.println("get the " + (i+1) + "st age");
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j ++) {
                p.yearPasses();
            }
            p.amIOld();;
            System.out.println();
        }
        sc.close();
    }
}
