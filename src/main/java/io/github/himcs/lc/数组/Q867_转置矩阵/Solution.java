package io.github.himcs.lc.数组.Q867_转置矩阵;

class Solution {
    public int[][] transpose(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}