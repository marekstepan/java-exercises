package com.ms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
	// A positive integer is called a perfect number if the sum of all its factors (excluding the number itself,
        // i.e., proper divisor) is equal to its value. For example, the number 6 is perfect
        // because its proper divisors are 1, 2, and 3, and 6=1+2+3; but the number 10 is not perfect
        // because its proper divisors are 1, 2, and 5, and 10≠1+2+5.
        // Write a boolean method called isPerfect(int aPosInt) that takes a positive integer, and return true if the
        // number is perfect.
        // Write a program called PerfectNumberList that prompts user for an upper bound (a
        // positive integer), and lists all the perfect numbers less than or equal to this upper bound.
        // It shall also list all the numbers that are neither deficient nor perfect.
        System.out.println("Enter upper bound:");
        Scanner s = new Scanner(System.in);
        int upperBound = s.nextInt();
        System.out.println("Perfect numbers:\n");
        System.out.println(listPerfectNumbers(upperBound));
    }

    public static List<Integer> listPerfectNumbers(int upperBound) {
        List<Integer> perfectNumbers = new ArrayList<>();
        List<Integer> divisors = new ArrayList<>();
        //completely naive solution
        for (int i = 1; i <= upperBound ; i++) {
            for (int j = 1; j <= i / 2; j++) {
                if(i % j == 0) {
                    divisors.add(j);
                }
            }
            int sum = 0;
            for(int d : divisors) {
                sum += d;
            }
            if(sum == i) {
                perfectNumbers.add(i);
            }
            divisors.clear();
        }
        return perfectNumbers;
    }
}
