package io.github.himcs.lc.数组.Q1431_拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        int len = candies.length;
        List<Boolean> res = new ArrayList(len);
        for (int i = 1; i < len; i++) {
            max = Math.max(max, candies[i]);
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            res.add(candies[i] + extraCandies >= max);
        }

        return res;
    }
}