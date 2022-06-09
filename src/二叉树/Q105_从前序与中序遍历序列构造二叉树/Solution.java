package 二叉树.Q105_从前序与中序遍历序列构造二叉树;

import 二叉树.TreeNode;

import java.util.*;

public class Solution {
    Map<Integer, Integer> rootMap = new HashMap<>();

    int[] preorder;
    int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        for (int i = 0; i < inorder.length; i++) {
            rootMap.put(inorder[i], i);
        }
        return buildTree(0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int preorderLeft, int preorderRight, int inorderLeft, int inorderRight) {
        if (preorderLeft > preorderRight) {
            return null;
        }
        //构建子节点
        //根节点值
        int rootVal = preorder[preorderLeft];
        TreeNode treeNode = new TreeNode(rootVal);
        // 根节点 下标
        int inorderRootIndex = rootMap.get(rootVal);
        // 得到左子树中的节点数目 inorderRootIndex - inorderLeft
        int leftLen = inorderRootIndex - inorderLeft;
        int rightLen = inorderRight - inorderRootIndex;
        // 左子树 =  [preorderLeft + 1,?] = [ inorderLeft, inorderRootIndex - 1]
        // ? -  preorderLeft + 1 =   inorderRootIndex - 1 - inorderLeft
        // 左结束节点位置 = inorderRootIndex - 1 - inorderLeft + preorderLeft + 1 = inorderRootIndex - inorderLeft + preorderLeft
        int leftPreRight = preorderLeft + leftLen;
        treeNode.left = buildTree(preorderLeft + 1, leftPreRight, inorderLeft, inorderRootIndex - 1);
        // 右子树 长度 = [左结束节点位置+1,preorderRight] = [inorderRootIndex + 1,inorderRight]
        //  preorderRight - x = inorderRight - (inorderRootIndex + 1)
        // x = preorderRight - inorderRight - (inorderRootIndex + 1)
        //右子树起始位置  preorderRight - rightLen + 1 = leftPreRight+1 两种计算方式等价
        treeNode.right = buildTree(preorderRight - rightLen + 1, preorderRight, inorderRootIndex + 1, inorderRight);
        return treeNode;
    }

    public static void main(String[] args) {
        new Solution().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}
        );
    }
}
