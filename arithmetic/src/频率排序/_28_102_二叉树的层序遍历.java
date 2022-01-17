package 频率排序;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * tip: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 *
 * @author zhumingcheng
 * createTime: 2022-01-17 11:33
 */
public class _28_102_二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelLength = 1;
        List<Integer> levelList = new ArrayList<>();
        TreeNode node;
        while (!queue.isEmpty()) {
            node = queue.poll();
            levelList.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (--levelLength == 0) {
                // 当前层遍历完毕
                levelLength = queue.size();
                result.add(levelList);
                levelList = new ArrayList<>();
            }
        }
        return result;
    }
}