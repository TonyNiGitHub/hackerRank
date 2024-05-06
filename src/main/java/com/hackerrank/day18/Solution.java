package com.hackerrank.day18;

import java.util.*;

public class Solution {

    // Write your code here.
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<>();

    /**
     * pushes a character onto a stack
     * @param c
     */
    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    /**
     * enqueues a character in the queue instance variable
     * @param ch
     */
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    /**
     * pops and returns the character at the top of the stack instance variable
     * @return
     */
    public char popCharacter() {
        if (stack != null && !stack.empty()) {
            return stack.pop();
        }
        return 0;
    }

    /**
     * dequeues and returns the first character from the queue instance variable
     * @return
     */
    public char dequeueCharacter() {
        if (queue != null && !queue.isEmpty()) {
            char c = queue.peek();
            queue.remove();
            return c;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c: s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Deuene the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i ++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome 回文 or not.
        System.out.println("The word, " + input + ", is " +
                ((!isPalindrome)? "not a palindrome." : "a palindrome."));
    }

}
