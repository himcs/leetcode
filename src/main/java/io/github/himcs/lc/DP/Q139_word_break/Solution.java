package io.github.himcs.lc.DP.Q139_word_break;

import java.util.List;

public class Solution {
    /**
     * dp[i] i位置能否被分割
     * j 作为分割点
     * dp[i]=dp[j] && check(s[j..i−1])
     *
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
