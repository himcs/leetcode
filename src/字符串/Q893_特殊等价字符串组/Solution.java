package 字符串.Q893_特殊等价字符串组;

import java.util.*;

public class Solution {
  public int numSpecialEquivGroups(String[] A) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : A) {
      // 0 2 4
      char[] chars = s.toCharArray();
      List list = new ArrayList();
      List list2 = new ArrayList();

      for (int i = 0; i < chars.length; i += 2) {
        list.add(chars[i]);
      }

      // 1 3 5
      for (int i = 1; i < chars.length; i += 2) {
        list2.add(chars[i]);
      }
      Collections.sort(list);
      Collections.sort(list2);

      StringBuilder k1 = new StringBuilder();
      StringBuilder k2 = new StringBuilder();
      list.forEach(k1::append);
      list2.forEach(k2::append);

      String key = k1.toString() + "_" + k2.toString();
      map.put(key, map.getOrDefault(map.get(key), 0) + 1);
    }

    return map.size();
  }
}
