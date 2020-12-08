package 字符串.Q1189_气球的最大数量;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int maxNumberOfBalloons(String text) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : text.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    Map<Character, Integer> map2 = new HashMap<>();
    map2.put('a', 1);
    map2.put('b', 1);
    map2.put('l', 2);
    map2.put('o', 2);
    map2.put('n', 1);
    int min = 10000;
    for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
      if (!map.containsKey(entry.getKey())) {
        return 0;
      } else {
        int v = map.get(entry.getKey()) / entry.getValue();
        if (v < min) {
          min = v;
        }
      }
    }
    return min;
  }
}
