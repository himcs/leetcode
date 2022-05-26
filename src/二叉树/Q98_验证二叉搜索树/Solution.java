package 二叉树.Q98_验证二叉搜索树;

import 二叉树.TreeNode;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    private boolean isValidBST(TreeNode node,Integer lower,Integer upper)
    {
        if(node == null)
        {
            return true;
        }
        int val = node.val;
        if(lower != null && val <= lower)
        {
            return false;
        }
        if(upper != null && val >= upper)
        {
            return false;
        }

        //左
        if(!isValidBST(node.left, lower, val))
        {
            return false;
        }

        //右
        if( !isValidBST(node.right, val, upper)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2147483647);
        boolean validBST = new Solution().isValidBST(treeNode);
        System.out.println(validBST);
    }

}
