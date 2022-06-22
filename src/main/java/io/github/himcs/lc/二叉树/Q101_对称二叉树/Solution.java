package io.github.himcs.lc.二叉树.Q101_对称二叉树;

import io.github.himcs.lc.二叉树.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val &&
                check(p.left, q.right) &&
                check(p.right, q.left);
    }
}
