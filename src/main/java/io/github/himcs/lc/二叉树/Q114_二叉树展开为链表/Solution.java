package io.github.himcs.lc.二叉树.Q114_二叉树展开为链表;

import io.github.himcs.lc.二叉树.TreeNode;

public class Solution {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode.left = null;
        treeNode.right = treeNode1;
        new Solution().flatten(treeNode);
    }

    public void flatten(TreeNode root) {
        buildTree(root);
    }

    private void buildTree(TreeNode node) {
        if (node == null) {
            return;

        }
        TreeNode nodeRight = node.right;
        TreeNode nodeLeft = node.left;

        node.left = null;
        if (nodeLeft != null) {
            node.right = nodeLeft;
            buildTree(nodeLeft);
            TreeNode p;
            for (p = nodeLeft; p.right != null; p = p.right) {

            }
            if (p != null) {
                p.right = nodeRight;
            }
        }
        buildTree(nodeRight);
    }
}
