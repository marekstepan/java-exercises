package com.ms;

public class HarmonicSum {

    public static void main(String[] args) {
	// Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000. 
        // The program shall compute the sum from left-to-right as well as from the right-to-left. 
        // Are the two sums the same? Obtain the absolute difference between these two sums and explain the difference. 
        // Which sum is more accurate?
        double maxDenominator = 50000;
        System.out.println(countLeftHarmonicSum(maxDenominator));
        System.out.println(countRightHarmonicSum(maxDenominator));
        System.out.println(countLeftHarmonicSum(maxDenominator) - countRightHarmonicSum(maxDenominator));
        System.out.println("floating point is not accurate. use BigDecimal instead. Better from right to left. \n"
            + "In the left to right sum a longer part of the mantissa needs to be dropped for the smallest " +
            "added numbers. ");
    }
    
    public static double countLeftHarmonicSum(double maxDenominator) {
        double leftHarmonicSum = 0;
        for (int i = 1; i <= maxDenominator ; i++) {
            leftHarmonicSum = leftHarmonicSum + (double)1 / i;
        }
        return leftHarmonicSum;
    }

    public static double countRightHarmonicSum(double maxDenominator) {
        double rightHarmonicSum = 0;
        for (int i = (int)maxDenominator; i > 0 ; i--) {
            rightHarmonicSum = rightHarmonicSum + (double)1 / i;
        }
        return rightHarmonicSum;
    }
}
