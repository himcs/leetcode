package 暴力.Q84_柱状图中最大的矩形;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = - 1;
        for (int i = 0; i < heights.length; i++) {
            //向左寻找第一个小于i的下标
            int left = i;
            int right = i;
            while ( left-1 >=0 && heights[left-1] >= heights[i] )
            {
                left --;
            }
            while (right+1 < heights.length &&  heights[right+1] >= heights[i])
            {
                right ++;
            }
           int area = heights[i] *( right - left+1);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {

       int i =  new Solution().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        System.out.println(i);
    }
}