package com.ms;

import java.util.ArrayList;
import java.util.List;

public class DigitExtraction {

    public static void main(String[] args) {
	// Write a program called ExtractDigits to extract each digit from an int, in the reverse order.
        // For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.
        int number = 58798985;
        System.out.println(extractDigits(number));
    }

    public static List<Integer> extractDigits(int number) {
        List<Integer> extractedDigits = new ArrayList<>();
        int res = number;
        while(res > 0) {
            extractedDigits.add(res % 10);
            res = res / 10;
        }
        return extractedDigits;
    }
}
