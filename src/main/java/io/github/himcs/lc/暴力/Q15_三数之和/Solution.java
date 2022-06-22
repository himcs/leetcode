package io.github.himcs.lc.暴力.Q15_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 暴力解法
 */
class Solution {
    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            int z = 0 - nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == z) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                } else if (nums[j] + nums[k] < z) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return list;
    }
}