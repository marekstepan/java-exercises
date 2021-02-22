package com.ms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReversalTest {

  @Test
  void reverseTest() {
    String toBeReversed = ".erofeb sa diputs sa era uoy llits ,hsiw uoy sa semit ynam sa eurt dna eslaf fo sgninaem " +
        "eht hctiws nac uoy ,eslaf si ecnetnes siht fI";
    assertEquals("If this sentence is false, you can switch the meanings of false and true as many times as you wish," +
        " still you are as stupid as before.", StringReversal.reverse(toBeReversed));
  }

  @Test
  void reverseWithStackTest() {
    String toBeReversed = ".erofeb sa diputs sa era uoy llits ,hsiw uoy sa semit ynam sa eurt dna eslaf fo sgninaem " +
        "eht hctiws nac uoy ,eslaf si ecnetnes siht fI";
    assertEquals("If this sentence is false, you can switch the meanings of false and true as many times as you wish," +
        " still you are as stupid as before.", StringReversal.reverseWithStack(toBeReversed));
  }
}