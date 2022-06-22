package io.github.himcs.lc.数组.Q1608_特殊数组的特征值;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        new Solution().specialArray(new int[]{3, 5});
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int x = 1; x <= len; x++) {
            int min = 0;
            //len - x - 1 有可能 小于 0
            if ((len - x - 1) >= 0) {
                min = nums[len - x - 1];
            }
            //len - x 必定 不溢出边界
            int max = nums[len - x];
            if (x > min && x <= max)
                return x;
        }
        return -1;
    }
}
