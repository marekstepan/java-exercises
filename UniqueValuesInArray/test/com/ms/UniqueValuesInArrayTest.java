package com.ms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueValuesInArrayTest {

  @Test
  void returnUniqueValuesTest1() {
    int[][] inputMatrix = {{1, 1}, {4, 2}};
    List<Integer> outputList = new ArrayList<>();
    outputList.addAll(Arrays.asList(1, 2, 4));
    assertEquals(outputList, UniqueValuesInArray.returnUniqueValues(inputMatrix));
  }

  @Test
  void returnUniqueValuesTest2() {
    int[][] inputMatrix = {{1, 1, 2}, {4, 2, 8}, {8, 8, -1}};
    List<Integer> outputList = new ArrayList<>();
    outputList.addAll(Arrays.asList(-1, 1, 2, 4, 8));
    assertEquals(outputList, UniqueValuesInArray.returnUniqueValues(inputMatrix));
  }
}