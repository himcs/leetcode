package io.github.himcs.lc.数组.Q1170_比较字符串最小字母出现频次;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.f("abca"));
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] q = new int[queries.length];
        int[] w = new int[words.length];
        for (int i = 0; i < queries.length; i++) {
            q[i] = f(queries[i]);
        }
        for (int i = 0; i < words.length; i++) {
            w[i] = f(words[i]);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < q.length; i++) {
            int s = 0;
            for (int j = 0; j < w.length; j++) {
                if (q[i] < w[j]) {
                    s++;
                }
            }
            res[i] = s;
        }

        return res;
    }

    public int f(String s) {
        char min = 'z' + 1;
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (c < min) {
                sum = 1;
                min = c;
            } else if (c == min) {
                sum++;
            }
        }
        return sum;
    }
}
