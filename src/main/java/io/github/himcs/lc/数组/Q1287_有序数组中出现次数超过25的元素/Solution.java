package io.github.himcs.lc.数组.Q1287_有序数组中出现次数超过25的元素;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int s = 0;
        int f = 1;
        int len = arr.length;
        int ns = len / 4;
        for (; f < len; f++) {
            if (arr[f] == arr[s]) {
                if ((f - s + 1) > ns) {
                    return arr[s];
                }
            } else {
                s = f;
            }
        }
        return arr[0];
    }
}
