package io.github.himcs.lc.字符串.Q1624_两个相同字符之间的最长子字符串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Distance> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character key = chars[i];
            Distance v;
            if (map.get(key) != null) {
                v = map.get(key);
                v.endIndex = i;
            } else {
                Distance distance = new Distance();
                distance.startIndex = i;
                v = distance;
                map.put(key, v);
            }
        }

        int max = 0;
        for (Map.Entry<Character, Distance> entry : map.entrySet()) {
            Distance distance = entry.getValue();
            int d = distance.endIndex - distance.startIndex;
            if (d > max) {
                max = d;
            }
        }

        return max - 1;
    }

    public class Distance {
        public int startIndex = -1;
        public int endIndex = 0;
    }
}
