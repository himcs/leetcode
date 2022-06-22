package io.github.himcs.lc.数组.Q1399_统计最大组的数目;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        new Solution().countLargestGroup(10);
    }

    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (byte b : String.valueOf(i).getBytes()) {
                sum += (b - '0');
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int maxSum = 0;
        int maxV = map.values().stream().max(Integer::compare).get();
        for (int k : map.keySet()) {
            if (map.get(k) == maxV) {
                maxSum++;
            }
        }
        return maxSum;
    }
}
