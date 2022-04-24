package 回溯.Q39_组合总和;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private int target;
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        backtrace(new ArrayList<>(),0);
        return result;
    }

    private void backtrace(List<Integer> trace, int startIndex) {
        long sum = getSum(trace);
        //满足条件
        if (sum == target) {
            ArrayList<Integer> integers = new ArrayList<>(trace);
            result.add(integers);
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            int candidate = candidates[i];
            if (sum + candidate > target) {
                return;
            }
            trace.add(candidate);
            backtrace(trace, i);
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

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> lists = new Solution().combinationSum(candidates, target);
        System.out.println(lists);

    }

}