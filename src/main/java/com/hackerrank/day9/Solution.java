package com.hackerrank.day9;

import java.io.*;

/**
 * Recursion 3
 */
class Result {
    /**
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
    public static int factorial(int n) {
        // Write your code here
        if (n > 1) {
            return n * factorial(n - 1);
        }
        else
            return 1;
    }
}
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.factorial(n);

        System.out.println("result = " + result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

}
