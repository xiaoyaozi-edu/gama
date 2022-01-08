package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * tip: https://leetcode-cn.com/problems/same-tree/
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 17:33
 */
public class _100_相同的树 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);
        while (!queue.isEmpty()) {
            p = queue.poll();
            q = queue.poll();
            if (p == null && q == null) {
                continue;
            }
            if (p != null && q != null && p.val == q.val) {
                queue.offer(p.left);
                queue.offer(q.left);

                queue.offer(p.right);
                queue.offer(q.right);
                continue;
            }
            return false;
        }
        return true;
    }

}