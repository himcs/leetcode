package 二分查找.Q1237找出给定方程的正整数解;

/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> listList = new LinkedList<>();
        for (int i = 1; i <= 1000; i++) {
            int start = 1;
            int end = 1000;
            while (start <= end) {
                int mid = start + ((end - start) >> 1);
                int value = customfunction.f(i, mid);
                if (value == z) {
                    listList.add(Arrays.asList(i, mid));
                    break;
                }
                if (value > z) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return listList;
    }
}