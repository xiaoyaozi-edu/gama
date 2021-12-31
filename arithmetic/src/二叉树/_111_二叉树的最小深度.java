package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * tip: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
 *
 * @author zhumingcheng
 * createTime: 2021-12-29 12:12
 */
public class _111_二叉树的最小深度 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelLength = 1, minDepth = 0;
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.left == null && root.right == null) {
                minDepth++;
                break;
            }
            if (root.left != null) {
                queue.offer(root.left);
            }
            if (root.right != null) {
                queue.offer(root.right);
            }
            if (--levelLength == 0) {
                levelLength = queue.size();
                minDepth++;
            }
        }
        return minDepth;
    }

}