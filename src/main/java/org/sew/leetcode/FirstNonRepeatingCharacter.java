package org.sew.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingCharacter(String str) {

        Map<Character, Integer> charactersMap = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(charactersMap.containsKey(c)) {
                charactersMap.put(str.charAt(i), charactersMap.get(str.charAt(i)) + 1);
            } else {
                charactersMap.put(str.charAt(i), 1);
            }
        }

        char c = ' ';
        for(Map.Entry<Character, Integer> entry: charactersMap.entrySet()) {
            if (entry.getValue() == 1) {
                c = entry.getKey();
                break;
            }
        }

        return c;
    }
}
