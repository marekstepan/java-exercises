#!/usr/lib/jvm/java-11-openjdk-amd64/bin/java --source 11

public class MaxValueOfArray {

  public static void main(String[] args) {

    int[] numbers = {8, 5, 6, 3, 89, 101, 2};
    for(int num : numbers){
      System.out.println(num);
    }
    System.out.println("Max is:");
    System.out.println(getMaxValue(numbers));
  }

  public static int getMaxValue(int[] numbers) {
    int maxValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > maxValue) {
        maxValue = numbers[i];
      }
    }
    return maxValue;
  }
} 
