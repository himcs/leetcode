package io.github.himcs.lc.数组.Q53_最大子数组和;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int nowSum = 0;
        for (int i = 0; i < nums.length; i++) {
            nowSum += nums[i];
            if (nowSum > max) {
                max = nowSum;
            }
            if (nowSum < 0) {
                nowSum = 0;
            }
        }
        return max;
    }
}
