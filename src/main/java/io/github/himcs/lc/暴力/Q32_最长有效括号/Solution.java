package io.github.himcs.lc.暴力.Q32_最长有效括号;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    private static boolean validParentheses(char[] chars, int from, int to) {
        Deque deque = new ArrayDeque();
        for (int i = from; i < to; i++) {
            char c = chars[i];
            if (c == '(') {
                deque.push('(');
            } else if (c == ')') {
                if (deque.isEmpty()) {
                    return false;
                } else {
                    deque.pop();
                }
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(()";
        int len = s.length();
        Solution solution = new Solution();
        int i = solution.longestValidParentheses(s);
        System.out.println(i);

    }

    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        int n;
        if (length % 2 == 0) {
            n = length;
        } else {
            n = length - 1;
        }
        for (; n > 0; n -= 2) {
            for (int i = 0; i + n <= length; i++) {
                if (validParentheses(chars, i, i + n)) {
                    return n;
                }
            }
        }
        return 0;
    }
}
