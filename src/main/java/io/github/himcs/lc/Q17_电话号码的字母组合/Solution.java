package io.github.himcs.lc.Q17_电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    private static char[] getChars(char c) {
        return phoneMap.get(c).toCharArray();
    }

    public static void main(String[] args) {
        String digits = "7";
        List<String> strings = new Solution().letterCombinations(digits);
        System.out.println(strings);
    }

    //BFS
    public List<String> letterCombinations(String digits) {
        String temp = digits.replaceAll("a", "");

        int len = temp.length();
        List<String> res = new ArrayList<>();
        if (len < 1) {
            return res;
        }
        // 过滤1
        char[] chars = temp.toCharArray();
        char[] chars1 = getChars(chars[0]);
        for (char c : chars1) {
            res.add(String.valueOf(c));
        }

        for (int i = 1; i < len; i++) {
            char[] charsTemps = getChars(chars[i]);
            int s = res.size();
            for (int j = 0; j < s; j++) {
                for (char charsTemp : charsTemps) {
                    res.add(res.get(j) + charsTemp);
                }
            }
            for (int j = 0; j < s; j++) {
                res.remove(0);
            }
        }

        return res;
    }
}
