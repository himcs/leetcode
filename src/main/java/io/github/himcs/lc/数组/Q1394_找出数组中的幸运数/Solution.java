package io.github.himcs.lc.数组.Q1394_找出数组中的幸运数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //    [2,2,2,3,3]
    public int findLucky(int[] arr) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            int v = map.getOrDefault(k, 0);
            map.put(k, v + 1);
        }
        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
            int k = entries.getKey();
            int v = entries.getValue();
            if (k == v) {
                if (k > max) {
                    max = entries.getKey();
                }
            }
        }
        return max;
    }
}
