package org.sew.leetcode;

public class LongestSubstring {

    public static String longestSubstring(String str) {
        StringBuilder localStr = new StringBuilder(String.valueOf(str.charAt(0)));
        String maxStr = localStr.toString();

        for(int i = 1; i < str.length(); i++) {
            if(!localStr.toString().contains(String.valueOf(str.charAt(i)))) {
                localStr.append(str.charAt(i));
            } else {
                if(maxStr.length() < localStr.length()) {
                    maxStr = localStr.toString();
                }
                localStr = new StringBuilder(String.valueOf((str.charAt(i))));
            }
        }

        if(maxStr.length() < localStr.length()) {
            maxStr = localStr.toString();
        }
        return maxStr;
    }
}
