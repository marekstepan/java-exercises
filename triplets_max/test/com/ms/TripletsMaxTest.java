package com.ms;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TripletsMaxTest {

  private TripletsMax tripletsMax;

  @BeforeEach
  public void setUp() throws Exception {
    tripletsMax = new TripletsMax();
  }

  @Test
  public void shouldReturnTriplets() {
    int[] inputArray = {3,4,0,1, 1};
    int sum = 7;
    List<List<Integer>> outputTripletsList = TripletsMax.findTriplets(inputArray, sum);
    assertTrue(outputTripletsList.get(0).contains(3));
    assertTrue(outputTripletsList.get(0).contains(4));
    assertTrue(outputTripletsList.get(0).contains(0));
    assertEquals(1, outputTripletsList.size());
  }

}