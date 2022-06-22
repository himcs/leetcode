package io.github.himcs.lc.数组.Q1480_一维数组的动态和;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2};

        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int key = nums1[i];
            a.put(key, a.getOrDefault(key, 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            int key = nums2[i];
            b.put(key, b.getOrDefault(key, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Integer key : a.keySet()) {
            int h = Math.min(a.getOrDefault(key, 0), b.getOrDefault(key, 0));
            if (h > 0) {
                for (int i = 0; i < h; i++) {
                    list.add(key);
                }
            }
        }
        int[] nums = list.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(nums));
    }

    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = nums[0];
        for (int i = 1; i < len; i++) {
            res[i] = res[i - 1] + nums[i];
        }

        return res;
    }

}
