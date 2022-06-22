package io.github.himcs.lc.数组.Q922_按奇偶排序数组II;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int len = A.length;
        int odd = 1;
        int even = 0;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                res[even] = A[i];
                even += 2;
            } else {
                res[odd] = A[i];
                odd += 2;
            }
        }
        return res;
    }
}
