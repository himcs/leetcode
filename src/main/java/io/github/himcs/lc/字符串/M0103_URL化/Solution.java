package io.github.himcs.lc.字符串.M0103_URL化;

public class Solution {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
