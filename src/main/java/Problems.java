import org.sew.leetcode.*;

import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {
        PairSum pairsum = new PairSum();

        int[] arr = {4, 5, 1, -3, 6};
        System.out.println(pairsum.findPair(arr, 2));

        int[] nums = {3, 0, 1, 4, 2, 8, 6, 7};
        System.out.println(MissingNumber.findMissingNumber(nums));

        String str = "swiss";
        System.out.println(FirstNonRepeatingCharacter.firstNonRepeatingCharacter(str));

        int[] maxArray = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaximumSubArray.maximumSubArraySum(maxArray));

        int[] twoSumIndices = { 2, 4, 5, 8, 5, 6};
        System.out.println(Arrays.toString(TwoSum.twoSumIndices(twoSumIndices, 10)));

        String longestSubStr = "abcabciuvfdb";
        System.out.println("LongestSubstring: " + LongestSubstring.longestSubstring(longestSubStr));

        String brackets = "{[{()]]}";
        System.out.println("BalancedBrackets: " + BalancedBrackets.balancedBrackets(brackets));
    }
}
