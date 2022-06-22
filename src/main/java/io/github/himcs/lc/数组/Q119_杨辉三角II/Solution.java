package io.github.himcs.lc.数组.Q119_杨辉三角II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
        List<Integer> res = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            res.add(Combination(rowIndex, i));
        }
        return res;
    }

    private int Combination(int N, int k) {
        long res = 1;
        for (int i = 1; i <= k; i++)
            res = res * (N - k + i) / i;
        return (int) res;
    }
}
