package org.sew.leetcode;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean balancedBrackets(String str) {
        Stack<Character> openBrackets = new Stack<>();

        for(int i = 0; i<str.length()/2; i++) {
            char c = str.charAt(i);
            openBrackets.push(c);
        }

        boolean isBalancedBrackets = true;
        for(int j = str.length()/2 ; j < str.length() ; j++) {
            char closedBr = str.charAt(j);
            char c = openBrackets.pop();
            if(!((c == '[' && closedBr == ']') ||
                    (c == '{' && closedBr == '}') ||
                    (c == '(' && closedBr == ')'))) {
                isBalancedBrackets = false;
            }
        }

        return isBalancedBrackets;
    }
}
