package io.github.himcs.lc.排序.Q75_颜色分类;

public class Solution1 {
    public static void main(String[] args) {
        int[] t = new int[]{2, 0, 2, 1, 1, 0};
        new Solution1().sortColors(t);
        System.out.println(t);
    }

    public void sortColors(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {K
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
