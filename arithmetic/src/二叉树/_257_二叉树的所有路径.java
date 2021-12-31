package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/binary-tree-paths/
 *
 * @author zhumingcheng
 * createTime: 2021-12-26 17:44
 */
public class _257_二叉树的所有路径 {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<String> result = new ArrayList<>();
        Stack<Object> stack = new Stack<>();
        stack.push(root);
        stack.push(String.valueOf(root.val));
        String value;
        TreeNode tempNode;
        while (!stack.isEmpty()) {
            value = (String) stack.pop();
            tempNode = (TreeNode) stack.pop();
            if (tempNode.left != null) {
                stack.push(tempNode.left);
                stack.push(value + "->" + tempNode.left.val);
            }
            if (tempNode.right != null) {
                stack.push(tempNode.right);
                stack.push(value + "->" + tempNode.right.val);
            }
            if (tempNode.left == null && tempNode.right == null) {
                result.add(value);
            }
        }
        return result;
    }
}