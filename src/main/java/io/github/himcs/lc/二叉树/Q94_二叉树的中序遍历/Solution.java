package io.github.himcs.lc.二叉树.Q94_二叉树的中序遍历;

import io.github.himcs.lc.二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        zx(root);
        return list;
    }

    public void zx(TreeNode node) {
        if (node == null) {
            return;
        }
        zx(node.left);
        list.add(node.val);
        zx(node.right);
    }
}