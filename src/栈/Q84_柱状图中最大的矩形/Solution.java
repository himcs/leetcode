package 栈.Q84_柱状图中最大的矩形;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    /**
     * 单调递增栈
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int len = heights.length;
        for (int i = 0; i < len; i++) {
//            当前元素 小于 栈顶 就可以 计算出 栈顶下标处 最大面积
            while (!stack.isEmpty() && heights[stack.peekLast()] > heights[i] )
            {
                int h = heights[stack.removeLast()];
                int w;
                if(stack.isEmpty())
                {
                    w = i;
                }else{
                    w = i - stack.peekLast() -  1;
                }
                maxArea = Math.max(maxArea, w * h);
            }
            stack.addLast(i);
        }
        while (!stack.isEmpty())
        {
            int h = heights[stack.removeLast()];
            int w;
            if(stack.isEmpty())
            {
                w = len;
            }else{
                w = len  - stack.peekLast() -  1;
            }
            maxArea = Math.max(maxArea, w * h);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int i =  new Solution().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        System.out.println(i);
    }
}
