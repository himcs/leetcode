package 数组.M1704_消失的数字;

public class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int need = (len * (len + 1)) / 2;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return need - sum;
    }
}
