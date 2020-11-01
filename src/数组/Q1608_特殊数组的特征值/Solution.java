package 数组.Q1608_特殊数组的特征值;

import java.util.Arrays;

public class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[0] >= len) return len;
        for (int x = 1; x <= len; x++) {
            if (((len - x - 1) >= 0) && ((len - x) < len) && (nums[len - x] >= x) && nums[len - x - 1] < x) {
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new Solution().specialArray(new int[]{3, 5});
    }
}
