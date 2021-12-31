package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 *
 * @author zhumingcheng
 * createTime: 2021-12-26 11:32
 */
public class _94_二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tempList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode topNode;
        TreeNode tempNode;
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        while (!stack.isEmpty()) {
            topNode = stack.pop();
            tempList.add(topNode.val);
            tempNode = topNode.right;

            while (tempNode != null) {
                stack.push(tempNode);
                tempNode = tempNode.left;
            }
        }
        return tempList;
    }
}