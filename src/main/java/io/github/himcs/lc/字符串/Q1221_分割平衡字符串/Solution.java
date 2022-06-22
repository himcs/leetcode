package io.github.himcs.lc.字符串.Q1221_分割平衡字符串;

public class Solution {
    public static void main(String[] args) {
        new Solution().balancedStringSplit("RRLRRLRLLLRL");
    }

    //    "RRLRRLRLLLRL"
    public int balancedStringSplit(String s) {
        int stack = 0;
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                stack--;
            } else {
                stack++;
            }
            if (stack == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
