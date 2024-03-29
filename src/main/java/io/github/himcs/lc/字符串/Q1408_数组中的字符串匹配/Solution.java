package io.github.himcs.lc.字符串.Q1408_数组中的字符串匹配;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].indexOf(words[i]) != -1) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
