package com.ms;

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).
public class BunniesEars {

    public static void main(String[] args) {
        //first we must drive the herd into the corral - adviced by my 4yrs old daughter Helena
        //then...
        System.out.println(countEars(15));

    }

    public static int countEars(int numberOfBunnies) {
        int numberOfEars = 0;
        if(numberOfBunnies == 1) {
            numberOfEars = 2;
        } else {
            numberOfEars = countEars(numberOfBunnies - 1) + 2;
        }
        return numberOfEars;
    }
}
