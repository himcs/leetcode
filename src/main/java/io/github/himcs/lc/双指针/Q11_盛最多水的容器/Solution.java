package io.github.himcs.lc.双指针.Q11_盛最多水的容器;

/**
 * 双指针 每次移动最小的边
 */
public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;

        int max = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                max = Math.max(max, height[i] * (j - i));
                i++;
            } else {
                max = Math.max(max, height[j] * (j - i));
                j--;
            }
        }
        return max;
    }
}
