package com.ms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaredBiggerThan20 {

    public static void main(String[] args) {
	// Write a Stream Expression to find which number squared value is more then 20 from the following list:
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        System.out.println(selectNumbersSquaredBigger20(numbers));
    }

    public static List<Integer> selectNumbersSquaredBigger20(List<Integer> numbers) {
        List<Integer> numbersSquaredBigger20 = numbers.stream()
            .filter(n -> n * n > 20)
            .collect(Collectors.toList());
        return numbersSquaredBigger20;
    }
}
