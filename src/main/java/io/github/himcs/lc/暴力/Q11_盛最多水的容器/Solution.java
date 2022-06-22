package io.github.himcs.lc.暴力.Q11_盛最多水的容器;

/**
 * 暴力解法
 */
public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
            }
        }
        return max;
    }
}
