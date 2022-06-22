package io.github.himcs.lc.字符串.Q1170_比较字符串最小字母出现频次;

import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        String[] s1 =
                new String[]{
                        "bba",
                        "abaaaaaa",
                        "aaaaaa",
                        "bbabbabaab",
                        "aba",
                        "aa",
                        "baab",
                        "bbbbbb",
                        "aab",
                        "bbabbaabb"
                };
        String[] s2 =
                new String[]{
                        "aaabbb",
                        "aab",
                        "babbab",
                        "babbbb",
                        "b",
                        "bbbbbbbbab",
                        "a",
                        "bbbbbbbbbb",
                        "baaabbaab",
                        "aa"
                };
        new Solution().numSmallerByFrequency(s1, s2);
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ints = new int[queries.length];
        int[] ints2 = new int[words.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = f(queries[i]);
        }
        for (int i = 0; i < ints2.length; i++) {
            ints2[i] = f(words[i]);
        }
        for (int i = 0; i < ints.length; i++) {
            int sum = 0;
            for (int j = 0; j < ints2.length; j++) {
                if (ints[i] < ints2[j]) {
                    sum++;
                }
            }
            ints[i] = sum;
        }
        return ints;
    }

    public int f(String s) {
        SortedMap<Character, Integer> sortedMap = new TreeMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char key = chars[i];
            sortedMap.put(key, sortedMap.getOrDefault(key, 0) + 1);
        }
        return sortedMap.getOrDefault(sortedMap.firstKey(), 1);
    }
}
