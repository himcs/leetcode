package io.github.himcs.lc.排序.Q1636_按照频率将数组升序排序;

import java.util.Arrays;

/**
 * @author mcs [lik0x01@sp.noahgroup.com]
 */
class SolutionTest {

    public void testFrequencySort() {
        int[] a = {1, 1, 2, 2, 2, 3};
        Solution solution = new Solution();
        int[] ints = solution.frequencySort(a);
        System.out.println(Arrays.toString(ints));
    }
}