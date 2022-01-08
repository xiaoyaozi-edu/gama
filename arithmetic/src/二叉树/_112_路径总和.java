package 二叉树;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/path-sum/
 *
 * @author zhumingcheng
 * createTime: 2022-01-07 14:24
 */
public class _112_路径总和 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) { return false; }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            if (root.left == null && root.right == null && root.val == targetSum) {
                // 叶子节点，并且值比配，那就满足条件
                return true;
            }
            if (root.left != null) {
                root.left.val = root.left.val + root.val;
                stack.push(root.left);
            }
            if (root.right != null) {
                root.right.val = root.right.val + root.val;
                stack.push(root.right);
            }
        }
        return false;
    }

}