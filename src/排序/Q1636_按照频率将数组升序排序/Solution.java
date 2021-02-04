package 排序.Q1636_按照频率将数组升序排序;

import java.util.*;

/**
 * @author mcs [lik0x01@sp.noahgroup.com]
 */
//1636. 按照频率将数组升序排序  https://leetcode-cn.com/problems/sort-array-by-increasing-frequency/
class Solution {
    //    频率  , 数值
    public int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        // 收集频率
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            Integer value = integerIntegerEntry.getValue();
            Integer key = integerIntegerEntry.getKey();
            List<Integer> orDefault = map2.getOrDefault(value, new ArrayList<>());
            orDefault.add(key);
            map2.put(value, orDefault);
        }
        TreeMap<Integer, List<Integer>> integerListTreeMap = new TreeMap<>(map2);
        int index = 0;
        for (Map.Entry<Integer, List<Integer>> integerListEntry : integerListTreeMap.entrySet()) {
            Integer key = integerListEntry.getKey();
            List<Integer> list = integerListEntry.getValue();
            list.sort(Comparator.comparingInt(o -> o));
            for (int i = list.size() - 1; i >= 0; i--) {
                int v = list.get(i);
                for (int j = 0; j < key; j++) {
                    res[index++] = v;
                }
            }
        }
        return res;
    }
}