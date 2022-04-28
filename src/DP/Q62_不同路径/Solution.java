package DP.Q62_不同路径;

public class Solution {
    /**
     * 核心 在于每一个坐标 只能是由左或由上 两种方式移动得到
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        //DP 状态转移方程 dp[i][j] = dp[i-1][j] + dp[i][j-1]
        int[][] dp = new int[m][n];
        for(int i = 0; i<m;i++)
        {
            dp[i][0] = 1;
        }
        for(int j = 1; j<n;j++)
        {
            dp[0][j] = 1;
        }
        for(int i = 1; i<m;i++)
        {
            for(int j = 1; j<n;j++)
            {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
