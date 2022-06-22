package io.github.himcs.lc.数组.M0102_判定是否互为字符重排;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if (map1.size() != map2.size())
            return false;
        for (Character k : map1.keySet()) {
            if (map1.get(k) != map2.getOrDefault(k, 0))
                return false;
        }
        return true;
    }
}
