package com.ms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbersSquared {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(getSquaredPositiveNumbers(numbers));

    }

    public static List<Integer> getSquaredPositiveNumbers(List<Integer> numbers) {
        List<Integer> positiveNumbersSquared = numbers.stream()
            .filter(n -> n > 0)
            .map(n -> n*n)
            .collect(Collectors.toList());
        return positiveNumbersSquared;
    }
}
