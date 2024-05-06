package com.hackerrank.day12;

import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    /**
     * @param firstName - A string denoting the Person's first name.
     * @param lastName  - A string denoting the Person's last name.
     * @param id        - An integer denoting the Person's ID number.
     * @param scores    - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    /**
     * Method name: calculate
     * @return a character denoting the grade
     */
    public char calculate() {
        int totalTestScore = 0;
        double averageTestScore;
        for (int i = 0; i < testScores.length; i ++)
            totalTestScore += testScores[i];
        averageTestScore = (double)totalTestScore / testScores.length;

        if (averageTestScore >=90 && averageTestScore <=100)
            return 'O';
        else
            if (averageTestScore >=80 && averageTestScore <90)
                return 'E';
            else
                if (averageTestScore>=70 && averageTestScore <80)
                    return 'A';
                else
                    if (averageTestScore>=55 && averageTestScore<70)
                        return 'P';
                    else
                        if (averageTestScore >=40 && averageTestScore < 50)
                            return 'D';
                        else
                                return 'T';
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i ++) {
            testScores[i] = scanner.nextInt();
        }
        scanner.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
