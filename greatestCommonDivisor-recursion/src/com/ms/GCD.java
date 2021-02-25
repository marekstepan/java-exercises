package com.ms;

//Find the greatest common divisor of two numbers using recursion.

//for simplicity x >= y

public class GCD {

    public static void main(String[] args) {
        System.out.println(findGCD(145, 50));

    }

    public static int findGCD(int x, int y) {

        if(y == 0) {
            return x;
        } else {
            return findGCD(y, x % y);
        }
    }
}
