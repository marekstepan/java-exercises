package com.ms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 0, 8, 4, 1, 7};
        int sum = 7;
        System.out.println(findTriplets(nums, sum));
    }

    public static List<List<Integer>> findTriplets(int[] nums, int sum) {
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length-2; k++) {
                    if(nums[i] + nums[j] + nums[k] == sum) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        triplets.add(triplet);
                    }
                }
            }
        }
        return triplets;
    }
}

//naive solution. try later with hashset
