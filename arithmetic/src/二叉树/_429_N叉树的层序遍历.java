package 二叉树;

import java.util.*;

/**
 * tip: https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 10:09
 */
public class _429_N叉树的层序遍历 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int levelLength = 1;
        List<Integer> levelList = new ArrayList<>();
        while (!queue.isEmpty()) {
            root = queue.poll();
            levelList.add(root.val);
            if (root.children != null && root.children.size() > 0) {
                for (int i = 0; i < root.children.size(); i++) {
                    queue.offer(root.children.get(i));
                }
            }
            if (--levelLength == 0) {
                list.add(levelList);
                levelList = new ArrayList<>();
                levelLength = queue.size();
            }
        }
        return list;
    }

}