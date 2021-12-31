package 二叉树;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * @author zhumingcheng
 * createTime: 2021-12-26 16:32
 */
public class _226_翻转二叉树 {

    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return root;
        }
        stack.push(root);
        TreeNode popNode, tempNode;
        while (!stack.isEmpty()) {
            popNode = stack.pop();
            tempNode = popNode.left;
            popNode.left = popNode.right;
            popNode.right = tempNode;

            if (popNode.left != null) {
                stack.push(popNode.left);
            }
            if (popNode.right != null) {
                stack.push(popNode.right);
            }
        }
        return root;
    }

}