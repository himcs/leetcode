package 数组.Q56_合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        //先按第一个元素排序
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int x = intervals[i][0];
            int y = intervals[i][1];
            boolean addFlag =true;
            // 比较当前元素 是否在上一个区间
            for (int[] an : ans) {
                if(x <= an[1])
                {
                    an[1] = Math.max(an[1],y);
                    addFlag = false;
                    break;
                }
            }
            if(addFlag)
            {
                ans.add(new int[]{x, y});
            }
        }
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] a =new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = new Solution().merge(a);
        System.out.println(merge);
    }
}
