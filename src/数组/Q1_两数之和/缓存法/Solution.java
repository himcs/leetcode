package 数组.Q1_两数之和.缓存法;

import java.util.HashMap;
import java.util.Map;

/**
 * 每次查找从cached 查找
 * 每次计算后将结果缓存到 cached <val,index>
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cached = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (cached.containsKey(need)) {
                return new int[]{cached.get(need), i};
            }
            cached.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
