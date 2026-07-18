package org.sew.leetcode;

import java.util.Arrays;

public class PairSum {

    public boolean findPair(int[] arr, int k) {
        Arrays.sort(arr);

        int p = 0;
        int q = arr.length - 1;

        return pair(p, q, arr, k);
    }


    public boolean pair(int p, int q, int[] arr, int k) {
        if(p >= arr.length - 1 || q <= 0) return false;

        if(arr[p] + arr[q] == k) {
            return true;
        }

        if(arr[p] + arr[q] < k) {
            p = p + 1;
            return pair(p, q, arr, k);
        }

        q = q - 1;
        return pair(p, q, arr, k);
    }
}
