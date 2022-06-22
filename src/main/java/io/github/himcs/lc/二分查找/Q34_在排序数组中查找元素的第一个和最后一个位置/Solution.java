package io.github.himcs.lc.二分查找.Q34_在排序数组中查找元素的第一个和最后一个位置;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new Solution().searchRange(new int[]{1}, 1);
        System.out.println(ints);
    }

    public int[] searchRange(int[] nums, int target) {
        int low = -1;
        int high = -1;
        //search low
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] != target) {
                    low = mid;
                    break;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (low == -1) {
            return new int[]{low, high};
        }
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    high = mid;
                    break;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{low, high};
    }
}
