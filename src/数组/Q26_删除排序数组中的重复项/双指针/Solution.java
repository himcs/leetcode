package 数组.Q26_删除排序数组中的重复项.双指针;

import javafx.collections.transformation.SortedList;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        // 慢指针
        int i = 0;
        //快指针
        for (int j = 1; j < length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                if (i != j) {
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
    }
}
