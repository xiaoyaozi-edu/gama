package 二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 *
 * @author zhumingcheng
 * createTime: 2022-01-05 16:02
 */
public class _145_二叉树的后序遍历 {

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        // 中-右-左 遍历完后逆序 左-右-中
        while (!stack.isEmpty()) {
            root = stack.pop();
            if (root.left != null) {
                stack.push(root.left);
            }
            if (root.right != null) {
                stack.push(root.right);
            }
            list.add(root.val);
        }
        Collections.reverse(list);
        return list;
    }

}