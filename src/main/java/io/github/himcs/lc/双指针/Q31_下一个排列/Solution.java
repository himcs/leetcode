package io.github.himcs.lc.双指针.Q31_下一个排列;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        [4,2,0,2,3,2,0]

//        [4,2,0,3,0,2,2]

//        [4,2,2,0,0,2,3]
        new Solution().nextPermutation(new int[]{1, 2, 3});
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    Arrays.sort(nums, i + 1, len);
                    return;
                }
            }
        }
        Arrays.sort(nums);
        return;
    }
//123
//    132

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}