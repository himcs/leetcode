package io.github.himcs.lc.字符串.Q1436_旅行终点站;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        for (String s : map.values()) {
            if (!map.containsKey(s)) {
                return s;
            }

        }
        return "";
    }
}
