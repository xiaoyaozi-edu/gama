package 二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 10:00
 */
public class _590_N叉树的后序遍历 {

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        // 中-右-左 遍历完后逆序 左-右-中
        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            if (root.children != null && root.children.size() > 0) {
                for (int i = 0; i < root.children.size(); i++) {
                    stack.push(root.children.get(i));
                }
            }
        }
        Collections.reverse(list);
        return list;
    }

}