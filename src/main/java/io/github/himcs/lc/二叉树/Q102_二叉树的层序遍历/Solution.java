package io.github.himcs.lc.二叉树.Q102_二叉树的层序遍历;

import io.github.himcs.lc.二叉树.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        new Solution().levelOrder(null);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque();
        if (root != null)
            deque.push(root);

        while (!deque.isEmpty()) {

            ArrayList<Integer> list = new ArrayList<>();
            int currentLevelSize = deque.size();
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode node = deque.pollFirst();
                list.add(node.val);
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
            if (!list.isEmpty())
                res.add(list);

        }
        return res;
    }
}
