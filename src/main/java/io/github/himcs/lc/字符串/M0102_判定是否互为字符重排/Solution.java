package io.github.himcs.lc.字符串.M0102_判定是否互为字符重排;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        new Solution().CheckPermutation("abc", "bca");
    }

    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Map<Character, Integer> map1 = new HashMap();
        Map<Character, Integer> map2 = new HashMap();
        for (char c : chars1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : chars2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if (map1.size() != map2.size()) {
            return false;
        }
        Set<Map.Entry<Character, Integer>> entries = map1.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (map2.getOrDefault(entry.getKey(), 0) != entry.getValue()) {
                return false;
            }
        }

        return true;
    }
}
