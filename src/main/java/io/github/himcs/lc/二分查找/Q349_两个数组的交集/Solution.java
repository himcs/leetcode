package io.github.himcs.lc.二分查找.Q349_两个数组的交集;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = Arrays.stream(nums1).collect(HashSet::new, HashSet::add, HashSet::addAll);
        HashSet<Integer> h2 = Arrays.stream(nums2).collect(HashSet::new, HashSet::add, HashSet::addAll);
        h1.retainAll(h2);
        int[] ints = h1.stream().mapToInt(Integer::valueOf).toArray();
        return ints;
    }
}
