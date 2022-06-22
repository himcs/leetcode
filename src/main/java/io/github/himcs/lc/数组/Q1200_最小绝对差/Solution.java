package io.github.himcs.lc.数组.Q1200_最小绝对差;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        new Solution().minimumAbsDifference(new int[]{4, 2, 1, 3});
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int abs = Math.abs(arr[i + 1] - arr[i]);
            if (abs > min) {
                continue;
            }
            if (abs < min) {
                res.clear();
                min = abs;
            }
            List<Integer> temp = new ArrayList<>(2);
            if (arr[i] < arr[i + 1]) {
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
            } else {
                temp.add(arr[i + 1]);
                temp.add(arr[i]);
            }
            res.add(temp);
        }
        return res;
    }
}
