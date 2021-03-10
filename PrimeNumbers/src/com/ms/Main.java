package com.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// A positive integer is a prime if it is divisible by 1 and itself only. Write a boolean method called
        // isPrime(int aPosInt) that takes a positive integer and returns true if the number is a prime.
        // Write a program called PrimeList that prompts the user for an upper bound (a positive integer),
        // and lists all the primes less than or equal to it.
        System.out.println("enter upper bound:");
        Scanner s = new Scanner(System.in);
        int upperBound = s.nextInt();
        List<Integer> primeNumbers = listPrimeNumbers(upperBound);
        System.out.println(primeNumbers);
    }

    public static List<Integer> listPrimeNumbers(int upperBound) {
        List<Integer> primeNumbers = new ArrayList<>();

        if(upperBound == 1) {
            primeNumbers.add(1);
        } else if(upperBound == 2){
            primeNumbers.addAll(Arrays.asList(1,2));
        } else {
            primeNumbers.addAll(Arrays.asList(1,2,3));
        }
        if(upperBound > 4) {
            for (int i = 5; i <= upperBound; i++) {
                int maxDivisor = (int)Math.sqrt(i);
                boolean isPrime = true;
                for (int j = 1; j < primeNumbers.size(); j++) {
                    if(primeNumbers.get(j) > maxDivisor) {
                        break;
                    }
                    if (i % primeNumbers.get(j) == 0) {
                        isPrime = false;
                    }
                }
                if(isPrime) {
                    primeNumbers.add(i);
                }
            }
        }
        return primeNumbers;
    }
}
