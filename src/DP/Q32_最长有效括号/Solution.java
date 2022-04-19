package DP.Q32_最长有效括号;

public class Solution {
    /**
     * 两种情况
     * )) -> ((....))  i-dp[i-1]-1 是否有左括号  再加上原有的 dp[i-dp[i-1]-2]
     * () dp[i] = dp[i-2]+2
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        if (length < 2) {
            return 0;
        }
        int[] dp = new int[length];
        dp[1] = (chars[0] == '(' && chars[1] == ')') ? 2 : 0;
        int max = dp[1];
        for (int i = 2; i < length; i++) {
            if (chars[i] == ')') {
                if (chars[i - 1] == '(') {
                    dp[i] = dp[i - 2] + 2;
                } else {
                    if (i - dp[i - 1] - 1 >= 0 && chars[i - dp[i - 1] - 1] == '(') {
                        if (i - dp[i - 1] - 2 >= 0) {
                            dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2];
                        } else {
                            dp[i] = dp[i - 1] + 2;
                        }
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "))(())()((((((())(()))((())(((((((()))())((((())())(()())))))))))((()((()(()(()()((()()()(()()()))(()()(()(())())))()())()(((((";
        int len = s.length();
        Solution solution = new Solution();
        int i = solution.longestValidParentheses(s);
        System.out.println(i);

    }
}
