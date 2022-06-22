package io.github.himcs.lc.数组.Q1122_数组的相对排序;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        int index = 0;
        for (int j = 0; j < arr2.length; j++) {
            for (int x = 0; x < map.get(arr2[j]); x++) {
                res[index++] = arr2[j];
            }
            map.remove(arr2[j]);
        }
        Set<Integer> set = map.keySet();
        SortedSet<Integer> sortedSet = new TreeSet<>(set);
        for (int k : sortedSet) {
            for (int x = 0; x < map.get(k); x++) {
                res[index++] = k;
            }
        }
        return res;
    }
}