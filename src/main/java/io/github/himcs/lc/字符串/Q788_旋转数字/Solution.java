package io.github.himcs.lc.字符串.Q788_旋转数字;

public class Solution {
    public static void main(String[] args) {
        new Solution().rotatedDigits(10);
    }

    public int rotatedDigits(int N) {
        // 0 1 8
        // 2 5
        // 6 9
        // 不好 3 4 7
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.contains("3") || s.contains("4") || s.contains("7")) {
                continue;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    sb.append(reverse(c));
                }
                if (!sb.toString().equals(s)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public char reverse(char c) {
        if (c == '0' || c == '1' || c == '8') {
            return c;
        } else if (c == '2') {
            return '5';
        } else if (c == '5') {
            return '2';
        } else if (c == '6') {
            return '9';
        } else if (c == '9') {
            return '6';
        } else {
            return '-';
        }
    }
}
