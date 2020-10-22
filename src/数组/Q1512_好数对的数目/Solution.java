package 数组.Q1512_好数对的数目;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int len = nums.length;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
