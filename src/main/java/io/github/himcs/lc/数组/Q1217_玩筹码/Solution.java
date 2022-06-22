package io.github.himcs.lc.数组.Q1217_玩筹码;

/**
 * 将 所有的奇数 移到一点 代价为0
 * 将 所有的偶数移到一点 代价也为0
 * 奇 偶 差距为1 移动代价为最小的值
 */
public class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int i : position) {
            if (i % 2 == 0)
                even++;
            else odd++;
        }
        return Math.min(odd, even);
    }
}