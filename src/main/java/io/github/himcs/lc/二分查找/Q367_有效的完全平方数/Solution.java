package io.github.himcs.lc.二分查找.Q367_有效的完全平方数;

public class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            int mid = low + ((high - low) >>> 1);
            long val = ((long) mid) * mid;
            if (val == num) {
                return true;
            } else if (val > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
