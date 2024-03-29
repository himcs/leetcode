package io.github.himcs.lc.字符串.Q1455_检查单词是否为句中其他单词的前缀;

public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (s.startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
