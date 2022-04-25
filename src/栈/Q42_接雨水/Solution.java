package 栈.Q42_接雨水;

import java.util.Stack;

public class Solution {
    public int trap(int[] height) {
        //递减栈
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()  && height[stack.peek()] < height[i])
            {
                int popHeight = stack.pop();
                while (!stack.isEmpty() && height[stack.peek()] == height[popHeight])
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                {
                    int tempH = stack.peek();
                    int w = i-tempH-1;
                    int h = Math.min(height[i] - height[popHeight],  height[tempH]-height[popHeight]);
                    ans += w*h;
                }
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int trap = new Solution().trap(new int[]{4,2,0,3,2,5});
        System.out.println(trap);
    }
}