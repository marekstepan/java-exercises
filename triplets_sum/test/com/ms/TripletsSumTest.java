package com.ms;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TripletsSumTest {

  @Test
  public void shouldReturnTriplets() {
    int[] inputArray = {3,4,0,0,1};
    int sum = 7;
    List<List<Integer>> outputTripletsList = TripletsSum.findTriplets(inputArray, sum);
    assertTrue(outputTripletsList.get(0).contains(3));
    assertTrue(outputTripletsList.get(0).contains(4));
    assertTrue(outputTripletsList.get(0).contains(0));
    assertEquals(2, outputTripletsList.size());
  }

}