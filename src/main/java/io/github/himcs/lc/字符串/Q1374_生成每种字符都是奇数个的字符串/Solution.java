package io.github.himcs.lc.字符串.Q1374_生成每种字符都是奇数个的字符串;

public class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if ((n % 2) != 0) {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
            return sb.toString();
        }
        for (int i = 0; i < n - 1; i++) {
            sb.append('a');
        }
        sb.append('b');
        return sb.toString();
    }
}
