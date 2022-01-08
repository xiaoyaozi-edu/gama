package 二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 09:49
 */
public class _589_N叉树的前序遍历 {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            if (root.children != null && root.children.size() > 0) {
                for (int i = root.children.size() - 1; i >= 0; i--) {
                    stack.push(root.children.get(i));
                }
            }
        }
        return list;
    }

}