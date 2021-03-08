package com.ms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfOddNumbers {

    public static void main(String[] args) {
	// Write a Stream Expression to get the sum of the odd numbers in the following list:
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println(getOddNumbersAverage(numbers));

    }

    public static OptionalDouble getOddNumbersAverage(List<Integer> numbers) {
        OptionalDouble oddNumbersAverageNumbers = numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(n -> n)
            .average();
        return oddNumbersAverageNumbers;
    }
}
