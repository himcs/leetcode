package 数组.Q1_两数之和.暴力法;

/**
 * 检测每一对 i，j
 * 时间复杂度：O(N^2)O,其中 N是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
 *
 * 空间复杂度：O(1)O(1)。
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
