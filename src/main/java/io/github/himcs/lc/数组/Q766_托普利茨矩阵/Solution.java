package io.github.himcs.lc.数组.Q766_托普利茨矩阵;

public class Solution {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}};
        new Solution().isToeplitzMatrix(matrix);
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        for (int i = 0; i < M - 1; i++) {
            int start = matrix[i][0];
            int x = i + 1;
            for (int j = 1; x < M && j < N; j++, x++) {
                if (matrix[x][j] != start) {
                    return false;
                }
            }
        }
        for (int j = 1; j < N - 1; j++) {
            int start = matrix[0][j];
            int y = j + 1;
            for (int i = 1; i < M && y < N; y++, i++) {
                if (matrix[i][y] != start) {
                    return false;
                }
            }
        }

        return true;
    }
}
