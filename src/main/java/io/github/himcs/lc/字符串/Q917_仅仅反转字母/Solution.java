package io.github.himcs.lc.字符串.Q917_仅仅反转字母;

class Solution {

    public static void main(String[] args) {
        String s = new Solution().reverseOnlyLetters("a-bC-dEf-ghIj");
        System.out.println(s);
    }

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        char[] res = new char[len];
        int i = 0;
        int j = len - 1;
        while (i <= j) {
            boolean a = isAlpha(chars[i]);
            boolean b = isAlpha(chars[j]);
            if (a && b) {
                res[j] = chars[i];
                res[i] = chars[j];
                i++;
                j--;
            } else if (a) {
                res[j] = chars[j];
                j--;
            } else {
                res[i] = chars[i];
                i++;
            }
        }
        return new String(res);
    }

    private boolean isAlpha(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }
}
