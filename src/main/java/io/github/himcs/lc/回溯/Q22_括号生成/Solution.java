package io.github.himcs.lc.回溯.Q22_括号生成;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<String> answer = new ArrayList<>();

    private int max;

    public static void main(String[] args) {
        new Solution().generateParenthesis(3);
    }

    public List<String> generateParenthesis(int n) {
        max = n;
        backtrace(new StringBuilder(), 0, 0);
        return answer;
    }

    private void backtrace(StringBuilder trace, int leftCount, int rightCount) {
        if (trace.length() == max * 2) {
            answer.add(trace.toString());
        }

        if (leftCount < max) {
            trace.append('(');
            backtrace(trace, leftCount + 1, rightCount);
            trace.deleteCharAt(trace.length() - 1);
        }
        if (rightCount < leftCount) {
            trace.append(')');
            backtrace(trace, leftCount, rightCount + 1);
            trace.deleteCharAt(trace.length() - 1);
        }
    }
}