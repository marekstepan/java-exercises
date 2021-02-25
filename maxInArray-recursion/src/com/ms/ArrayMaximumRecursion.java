package com.ms;

//Write a function that finds the largest element of an array using recursion.
public class ArrayMaximumRecursion {

    public static void main(String[] args) {
        int[] a = {5, 8, 10, -1, 0, 3};
        int n = a.length;
        System.out.println(findMax(a, n));
    }

    public static int findMax(int[] a, int n) {
        if(n == 1) {
            return a[0];
        } else {
            return Math.max(a[n - 1], findMax(a, n - 1));
        }

    }
}
