package io.github.himcs.lc.数组.Q1475_商品折扣后的最终价格;

import java.util.Arrays;

class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] res = Arrays.copyOf(prices, len);

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (prices[j] <= prices[i]) {
                    res[i] = res[i] - prices[j];
                    break;
                }
            }
        }
        return res;
    }
}