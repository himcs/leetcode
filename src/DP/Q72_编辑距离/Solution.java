package DP.Q72_编辑距离;

public class Solution {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        //dp[i][j] 表示 word1 前i位转换到 word2 前j位的最小步骤
        int[][] dp = new int[m + 1][n + 1];
        //初始化dp
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }
        //状态转移方程
        //word1[i] == word2[j] : dp[i][j] = dp[i-1][j-1]
        //word[i] != word2[j]: 三种情况
        // word1 删除最后一个字符 dp[i][j] = dp[i-1][j] + 1
        // word1 添加最后一个字符 dp[i][j] = dp[i][j-1] + 1
        // word1 替换最后一个字符 dp[i][j] = dp[i-1][j-1] + 1

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]),dp[i-1][j-1])+1;
                }
            }
        }

        return dp[m][n];
    }
}
