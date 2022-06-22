package io.github.himcs.lc.字符串.Q13_罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        new Solution().romanToInt("MCMXCIV");
    }

    public int romanToInt(String s) {
        // 特殊情况判断
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            boolean hasNext = i < chars.length - 1;
            if (!hasNext) {
                sum += map.get(aChar);
                continue;
            }

            int nextIndex = i + 1;
            char nextChar = chars[nextIndex];
            if (aChar == 'I') {
                if (nextChar == 'V') {
                    sum += 4;
                    i++;
                } else if (nextChar == 'X') {
                    sum += 9;
                    i++;
                } else {
                    sum += map.get(aChar);
                }
            } else if (aChar == 'X') {
                if (nextChar == 'L') {
                    sum += 40;
                    i++;
                } else if (nextChar == 'C') {
                    sum += 90;
                    i++;
                } else {
                    sum += map.get(aChar);
                }
            } else if (aChar == 'C') {
                if (nextChar == 'D') {
                    sum += 400;
                    i++;
                } else if (nextChar == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += map.get(aChar);
                }
            } else {
                sum += map.get(aChar);
            }
        }
        return sum;
    }
}
