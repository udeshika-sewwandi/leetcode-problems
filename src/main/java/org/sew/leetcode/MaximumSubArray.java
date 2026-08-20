package org.sew.leetcode;

public class MaximumSubArray {

    //kadane's algorithm
    public static int maximumSubArraySum(int[] nums) {
        int localSum = nums[0], maxSum = Integer.MIN_VALUE;

        for(int i=1; i< nums.length; i++) {
            if(localSum >= nums[i]) {
                localSum += nums[i];
            } else {
                localSum = nums[i];
            }
            if(maxSum < localSum) {
                maxSum = localSum;
            }
        }

        return maxSum;
    }
}
