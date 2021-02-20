package com.ms;

import java.util.Stack;

public class PalindromeVerification {

    public static void main(String[] args) {
	    String inputString = "Kobyla ma maly bok";
        System.out.println(isPalindrome(inputString));
    }

    public static boolean isPalindrome(String inputPalindrome) {
        String cleanInput = inputPalindrome.replace(" ", "").toLowerCase();
        char[] inputCharArray = cleanInput.toCharArray();
        String cleanOutput = "";
        Stack<Character> inputCharStack = new Stack<>();
        for (int i = 0; i < inputCharArray.length; i++) {
            inputCharStack.push(inputCharArray[i]);
        }
        while (!inputCharStack.isEmpty()) {
            cleanOutput += inputCharStack.pop();
        }
        return cleanInput.equals(cleanOutput);
    }
}
