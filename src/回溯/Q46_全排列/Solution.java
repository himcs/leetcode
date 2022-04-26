package 回溯.Q46_全排列;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        backtrace(new ArrayList<>());
        return ans;
    }
    private void backtrace(List<Integer> trace){
        if(trace.size() == nums.length)
        {
            List<Integer> a = new ArrayList<>();
            for (Integer integer : trace) {
                a.add(nums[integer]);
            }

            ans.add(a);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
           if(trace.contains(i))
           {
               continue;
           }
            trace.add(i);
            backtrace(trace);
            trace.remove(trace.size()-1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> permute = new Solution().permute(new int[]{1,2,3});
        System.out.println(permute);
    }
}
