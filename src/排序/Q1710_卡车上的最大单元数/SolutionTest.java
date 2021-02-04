package 排序.Q1710_卡车上的最大单元数;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mcs [lik0x01@sp.noahgroup.com]
 */
class SolutionTest {
    @Test
    public void testSort() {
        int[][] boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> o[1]));
        for (int[] boxType : boxTypes) {
            System.out.println(Arrays.toString(boxType));
        }
    }

    @Test
    public void  testMaximumUnits(){
        int[][] boxTypes = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        Solution solution = new Solution();
        int i = solution.maximumUnits(boxTypes, 4);
        System.out.println(i);
    }
}