#!/usr/lib/jvm/java-11-openjdk-amd64/bin/java --source 11

import java.util.Arrays;

public class SmallestTwo {

  public static void main(String[] args) {

    int[] numbers = {5, 7, -8, 5, 14, 1};
    for(int num : numbers){
      System.out.println(num);
    }
    Arrays.sort(numbers);
    System.out.println("Two smallest are:");
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
  }
}
