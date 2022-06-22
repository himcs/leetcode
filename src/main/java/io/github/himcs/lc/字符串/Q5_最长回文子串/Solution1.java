package io.github.himcs.lc.字符串.Q5_最长回文子串;

/**
 * 暴力解法
 */
public class Solution1 {

    public static void main(String[] args) {
        String babad = new Solution1().longestPalindrome("babad");
        System.out.println(babad);
    }

    public String longestPalindrome(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean b = checkPalindrome(s, i, j);
                if (b) {
                    if ((j - i + 1) > maxLength) {
                        maxLength = j - i + 1;
                        left = i;
                        right = j;
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }

    private boolean checkPalindrome(String s, int start, int end) {
        while (start <= end) {
            char a = s.charAt(start);
            char b = s.charAt(end);
            if (a != b) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
