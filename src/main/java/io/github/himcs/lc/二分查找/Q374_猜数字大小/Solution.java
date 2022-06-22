package io.github.himcs.lc.二分查找.Q374_猜数字大小;

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int t = guess(mid);
            if (t == -1) {
                high = mid - 1;
            } else if (t == 1) {
                low = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }
}