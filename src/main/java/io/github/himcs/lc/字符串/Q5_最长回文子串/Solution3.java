package io.github.himcs.lc.字符串.Q5_最长回文子串;

/**
 * 动态规划
 * 状态: dp[i][j] s[i..j] 是否为回文
 * 状态转移方程: dp[i][j] = (s[i] == s[j]) && (s[i+1][j-1])
 * 边界 j-1 - (i+1) + 1 < 2 整理 j-i-<3
 * <p>
 * 时间复杂度 O(n^2)
 * 空间复杂度 O(n^2)
 */
public class Solution3 {

    public static void main(String[] args) {
        String babad = new Solution3().longestPalindrome("babad");
        System.out.println(babad);
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int maxLength = 1;
        int left = 0;
        int len = s.length();

        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < left; i++) {
            dp[i][i] = true;
        }

//        依赖左下角的值 要一列一列算
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j]) {
                    int l = j - i + 1;
                    if (l > maxLength) {
                        maxLength = l;
                        left = i;
                    }
                }
            }
        }
        return s.substring(left, left + maxLength);
    }
}

