package com.hackerrank.day29;

import java.io.*;

class Result {
    /**
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER N
     * 2. INTEGER K
     */
    public static int bitwiseAnd(int N, int K) {
        int max = 0;
        // Write your code here
        for (int a = 1; a <= N; a ++) {
            for (int b = 1; b <= N; b ++) {
                if (a < b) {
                    int c = a & b;
                    if (c > max && c < K) {
                        max = c;
                        System.out.println("a = " + a + ", b = " + b + ", result = " + (a & b));
                    }
                }
            } // for
        }  // for
        return max;
    }
}
public class Solution {

    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < t; i ++ ) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int count = Integer.parseInt(firstMultipleInput[0]);
            int lim = Integer.parseInt(firstMultipleInput[1]);
            int res = Result.bitwiseAnd(count, lim);
System.out.println("res = " + res);
          //  bufferedWriter.write(String.valueOf(res));
          //  bufferedWriter.newLine();
        }

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
