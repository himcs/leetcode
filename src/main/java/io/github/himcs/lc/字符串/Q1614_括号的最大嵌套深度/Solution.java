package io.github.himcs.lc.字符串.Q1614_括号的最大嵌套深度;

public class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int stack = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack++;
                max = Math.max(stack, max);
            } else if (c == ')') {
                stack--;
            }
        }
        return max;
    }
}
