package org.sew.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            numIndices.put(nums[i], i);
        }

        int[] indices = new int[2];
        for(int j = 0 ; j < nums.length; j++) {
            int secondEl = target - nums[j];

            if(numIndices.containsKey(secondEl)) {
                indices[0] = j;
                indices[1] = numIndices.get(secondEl);
                break;
            }
        }

        return indices;
    }
}
