package io.github.himcs.lc.字符串.Q557_反转字符串中的单词;

public class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            reverse(chars);
            strings[i] = String.valueOf(chars);
        }

        return String.join(" ", strings);
    }

    public void reverse(char[] c) {
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            char temp = c[j];
            c[j] = c[i];
            c[i] = temp;
            i++;
            j--;
        }
    }
}
