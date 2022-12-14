package 频率排序;

import 二叉树.TreeNode;

/**
 * tip: https://leetcode-cn.com/problems/diameter-of-binary-tree/
 *
 * @author zhumingcheng
 * createTime: 2022-02-10 16:39
 */
public class _89_543_二叉树的直径 {
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        heigh(root);
        return max;
    }
    public int heigh(TreeNode node) {
        if (node == null) return 0;
        int left = heigh(node.left);
        int right = heigh(node.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}