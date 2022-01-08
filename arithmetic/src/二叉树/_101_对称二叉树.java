package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * tip: https://leetcode-cn.com/problems/symmetric-tree/
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 12:07
 */
public class _101_对称二叉树 {

    public boolean isSymmetric(TreeNode root) {
        // 想象两个root，左子树和右子树比较，注意子树插入入队顺序
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(root);
        TreeNode a, b;
        while (!queue.isEmpty()) {
            a = queue.poll();
            b = queue.poll();
            if (a == null && b == null) {
                continue;
            }
            if (a != null && b != null && a.val == b.val) {
                queue.offer(a.right);
                queue.offer(b.left);

                queue.offer(a.left);
                queue.offer(b.right);
                continue;
            }
            // 一个为null，一个不为null，显然不是
            // 都不为null，但是他们的值不相等，也不是
            return false;
        }
        return true;
    }

}