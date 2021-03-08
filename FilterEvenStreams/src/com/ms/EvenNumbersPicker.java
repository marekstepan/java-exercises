package com.ms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersPicker {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        System.out.println(filterEvenNumbers(numbers));

    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());
        return evenNumbers;
    }
}
