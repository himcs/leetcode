package 二叉树.Q124_二叉树中的最大路径和;

import 二叉树.TreeNode;

public class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getValue(root);
        return max;
    }

    private int getValue(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int val = node.val;
        int leftVal = Math.max(getValue(node.left), 0);
        int rightVal = Math.max(getValue(node.right), 0);
        max = Math.max(val + leftVal + rightVal, max);
        // 返回节点的最大贡献值 关键
        return val + Math.max(leftVal, rightVal);

    }

}
