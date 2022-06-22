package io.github.himcs.lc.回溯.Q39_组合总和;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<List<Integer>> result = new ArrayList<>();
    private int target;
    private int[] candidates;

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 7, 6, 3, 5, 1};
        int target = 9;
        List<List<Integer>> lists = new Solution().combinationSum(candidates, target);
        System.out.println(lists);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        backtrace(new ArrayList<>(), 0, 0);
        return result;
    }

    private void backtrace(List<Integer> trace, int startIndex, int sum) {
        //满足条件
        if (sum == target) {
            ArrayList<Integer> integers = new ArrayList<>(trace);
            result.add(integers);
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            int candidate = candidates[i];
            if (sum + candidate > target) {
                continue;
            }
            trace.add(candidate);
            backtrace(trace, i, sum + candidate);
            trace.remove(trace.size() - 1);
        }

    }

    private int getSum(List<Integer> trace) {
        int sum = 0;
        for (Integer integer : trace) {
            sum += integer;
        }
        return sum;
    }

}