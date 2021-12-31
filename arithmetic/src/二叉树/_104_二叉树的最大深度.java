package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * tip: https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 *
 * @author zhumingcheng
 * createTime: 2021-12-28 21:00
 */
public class _104_二叉树的最大深度 {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelLength = 1, maxDepth = 0;
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.left != null) {
                queue.offer(root.left);
            }
            if (root.right != null) {
                queue.offer(root.right);
            }
            if (--levelLength == 0) {
                levelLength = queue.size();
                maxDepth++;
            }
        }
        return maxDepth;
    }
}