package com.ms;

//We have bunnies standing in a line, numbered 1, 2, ...
//The odd bunnies (1, 3, ..) have the normal 2 ears.
//The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
//Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class BunniesEars2 {

    public static void main(String[] args) {
        System.out.println(countEars(3));
    }

    public static int countEars(int numberOfBunnies) {
        int numberOfEars = 0;
        if(numberOfBunnies == 1) {
            numberOfEars = 2;
        } else {
            if(numberOfBunnies%2 == 0) {
                numberOfEars = countEars(numberOfBunnies - 1) + 3;
            } else {
                numberOfEars = countEars(numberOfBunnies - 1) +2;
            }
        }
        return numberOfEars;
    }
}
