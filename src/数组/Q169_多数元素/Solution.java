package 数组.Q169_多数元素;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int k : map.keySet()) {
            if (map.get(k) > len / 2)
                return k;
        }
        return -1;
    }
}
