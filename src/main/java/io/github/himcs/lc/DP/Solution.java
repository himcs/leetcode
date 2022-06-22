package io.github.himcs.lc.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        编号 1 2 3 4
//        体积 2 3 4 5
//        价值 3 4 5 6
// 背包容量
public class Solution {
    public static void main(String[] args) {
        int BAG = 10;
        int[] v = new int[]{0, 2, 4, 3, 7};
        int[] p = new int[]{0, 2, 3, 5, 5};
        int THINGS = v.length - 1;
        int[][] result = new int[THINGS + 1][BAG + 1];

        for (int i = 1; i <= THINGS; i++) {
            // 装不下当前体积
            for (int j = 1; j < v[i]; j++) {
                int lastV = result[i - 1][j];
                result[i][j] = lastV;
            }
            // 装的下当前体积
            for (int j = v[i]; j <= BAG; j++) {
                int lastV = result[i - 1][j];
                // 包含当前物品 当前空间最大价值 = 当前物品价值 + 剩余空间最大价值
                int mv = p[i] + result[i - 1][j - v[i]];
                if (mv > lastV) {
                    result[i][j] = mv;
                } else {
                    result[i][j] = lastV;
                }
            }
        }

        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }

        // 回溯
        int x = THINGS;
        int y = BAG;
        List<Integer> res = new ArrayList<>();
        while (x != 0 && y != 0) {
            if (result[x][y] != result[x - 1][y]) {
                res.add(x);
                y = BAG - v[x];
            }
            x = x - 1;
        }
        System.out.println(res);
    }
}
