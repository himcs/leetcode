package io.github.himcs.lc.暴力.Q49_字母异位词分组;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<List<String>> lists = new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(lists);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        //每个字符串进行分组
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);

        }
        for (List<String> value : map.values()) {
            ans.add(value);
        }
        return ans;
    }
}
