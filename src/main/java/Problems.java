import org.sew.leetcode.MissingNumber;
import org.sew.leetcode.PairSum;

public class Problems {
    public static void main(String[] args) {
        PairSum pairsum = new PairSum();

        int[] arr = {4, 5, 1, -3, 6};
        System.out.println(pairsum.findPair(arr, 2));

        int[] nums = {3, 0, 1, 4, 2, 8, 6, 7};
        System.out.println(MissingNumber.findMissingNumber(nums));
    }
}
