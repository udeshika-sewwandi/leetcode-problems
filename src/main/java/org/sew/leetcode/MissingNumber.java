package org.sew.leetcode;

import java.util.Arrays;
import java.util.OptionalInt;

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int actualSum = nums.length * (nums.length+1)/2;

//        int arraySum = Arrays.stream(nums).sum();
        int arraySum = 0;

        for (int num: nums) {
            arraySum += num;
        }

        return actualSum - arraySum;

//        int xor = 0;
//
//        for(int i = 0; i<nums.length; i++) {
//            xor ^= i;
//        }
//
//        for (int num: nums) {
//            xor ^= num;
//        }
//
//        return xor;
    }
}
