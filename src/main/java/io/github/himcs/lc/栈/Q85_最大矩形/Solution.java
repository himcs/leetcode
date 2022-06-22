package io.github.himcs.lc.栈.Q85_最大矩形;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static void main(String[] args) {
        int i = new Solution().maximalRectangle(new char[][]{{'0', '1'}, {'1', '0'}});
        System.out.println(i);
    }

    /**
     * 每一行 为底 依次计算
     * 使用84题 递增栈算法
     *
     * @param matrix
     * @return
     */
    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        // 构造每一行
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int[] heights = new int[n];
            for (int x = 0; x < n; x++) {
                for (int y = i; y >= 0 && matrix[y][x] == '1'; y--) {
                    heights[x]++;
                }
            }
            maxArea = Math.max(largestRectangleArea(heights), maxArea);
        }
        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int len = heights.length;
        for (int i = 0; i < len; i++) {
//            当前元素 小于 栈顶 就可以 计算出 栈顶下标处 最大面积
            while (!stack.isEmpty() && heights[stack.peekLast()] > heights[i]) {
                int h = heights[stack.removeLast()];
                int w;
                if (stack.isEmpty()) {
                    w = i;
                } else {
                    w = i - stack.peekLast() - 1;
                }
                maxArea = Math.max(maxArea, w * h);
            }
            stack.addLast(i);
        }
        while (!stack.isEmpty()) {
            int h = heights[stack.removeLast()];
            int w;
            if (stack.isEmpty()) {
                w = len;
            } else {
                w = len - stack.peekLast() - 1;
            }
            maxArea = Math.max(maxArea, w * h);
        }

        return maxArea;
    }
}
