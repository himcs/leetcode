package io.github.himcs.lc.排序.Q1710_卡车上的最大单元数;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mcs [lik0x01@sp.noahgroup.com]
 */
//1710. 卡车上的最大单元数 https://leetcode-cn.com/problems/maximum-units-on-a-truck/
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum = 0;
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));

        for (int i = boxTypes.length - 1; i >= 0 && truckSize > 0; i--) {
            int[] boxType = boxTypes[i];
            int c = Math.min(boxType[0], truckSize);
            int needSize = (boxType[1] * c);
            sum += needSize;
            truckSize -= c;
        }
        return sum;
    }
}