package 回溯.Q78_子集;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        backtrace(-1, new ArrayList());
        return res;
    }

    private void backtrace(int breakI, List<Integer> trace) {
        //添加 trace
        res.add(new ArrayList<>(trace));
        for (int i = 0; i < nums.length; i++) {
            if (i <= breakI || trace.contains(nums[i])) {
                continue;
            }
            trace.add(nums[i]);
            backtrace(i, trace);
            trace.remove(trace.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> subsets = new Solution().subsets(new int[]{1, 2, 3});
        System.out.println(subsets);

    }
}
