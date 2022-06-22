package io.github.himcs.lc.数组.Q566_重塑矩阵;

public class Solution {
    public static void main(String[] args) {
        new Solution().matrixReshape(new int[][]{{1, 2},
                {3, 4}}, 1, 4);
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;
        if (n * m != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (y == c) {
                    x++;
                    y = 0;
                }
                //计算 新下标
                res[x][y++] = nums[i][j];
            }
        }
        return res;
    }
}
