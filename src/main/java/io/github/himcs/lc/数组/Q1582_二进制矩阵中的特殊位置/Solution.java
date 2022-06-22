package io.github.himcs.lc.数组.Q1582_二进制矩阵中的特殊位置;

public class Solution {
    public static void main(String[] args) {
        int s = new Solution().numSpecial(new int[][]{{0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0}});
        System.out.println(s);
    }

    public int numSpecial(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        int[] row = new int[M];
        int[] col = new int[N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }

        int ans = 0;
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (mat[i][j] == 1 && row[i] == 1 && col[j] == 1)
                    ans++;

        return ans;
    }
}