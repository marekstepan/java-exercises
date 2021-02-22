package com.ms;

import java.util.Stack;

public class StringReversal {

    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String which is passed as parameter
        // Pass the toBeReversed variable to this method to check if it works well
        // Solve this task using charAt() function first
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));
        System.out.println(reverseWithStack(toBeReversed));
    }

    public static String reverse(String string) {
        String reversedString = "";
        for (int i = 0; i < string.length(); i++) {
            reversedString += string.charAt(string.length() - i - 1);
        }
        return reversedString;
    }

    public static String reverseWithStack(String string) {
        Stack<Character> charStack = new Stack<>();
        String reversedString = "";
        for (int i = 0; i < string.length(); i++) {
            charStack.push(string.charAt(i));
        }
        while (!charStack.isEmpty()) {
            reversedString += charStack.pop();
        }
        return reversedString;
    }
}
