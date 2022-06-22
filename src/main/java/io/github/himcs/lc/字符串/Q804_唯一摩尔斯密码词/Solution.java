package io.github.himcs.lc.字符串.Q804_唯一摩尔斯密码词;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    final String[] mos =
            new String[]{
                    ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "", ".---", "-.-", ".-..", "--",
                    "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
            };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            String key = representations(word);
            set.add(key);
        }

        return set.size();
    }

    public String representations(String words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : words.toCharArray()) {
            int index = c - 'a';
            stringBuilder.append(mos[index]);
        }
        return stringBuilder.toString();
    }
}
