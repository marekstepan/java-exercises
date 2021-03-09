package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tribonacci {

    public static void main(String[] args) {
	// Tribonacci numbers are a sequence of numbers T(n) similar to Fibonacci numbers, except that a number is formed
        // by adding the three previous numbers, i.e., T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2.
        // Write a program called Tribonacci to produce the first twenty Tribonacci numbers.
        int max = 20;
        System.out.println(listTribonacciNumbers(max));
    }

    public static List<Integer> listTribonacciNumbers(int max) {
        List<Integer> tribonacciSeries = new ArrayList<>();
        tribonacciSeries.addAll(Arrays.asList(1,1,2));
        for (int i = 3; i < max; i++) {
            tribonacciSeries.add(tribonacciSeries.get(i-1) + tribonacciSeries.get(i-2) + tribonacciSeries.get(i-3));
        }
        return tribonacciSeries;
    }
}
