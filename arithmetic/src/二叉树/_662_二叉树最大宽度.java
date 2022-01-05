package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * tip: https://leetcode-cn.com/problems/maximum-width-of-binary-tree/
 *
 * @author zhumingcheng
 * createTime: 2022-01-05 16:50
 */
public class _662_二叉树最大宽度 {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 1;
        queue.offer(root);
        // 假设节点 索引为n，那么它左节点索引为2*n，右节点索引为2*n+1
        int maxWeight = 1, levelLength = 1, leftIndex = 0;
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (leftIndex == 0) {
                leftIndex = root.val;
            }
            if (root.left != null) {
                root.left.val = 2 * root.val;
                queue.offer(root.left);
            }
            if (root.right != null) {
                root.right.val = 2 * root.val + 1;
                queue.offer(root.right);
            }
            if (--levelLength == 0) {
                maxWeight = Integer.max(maxWeight, root.val - leftIndex + 1);
                levelLength = queue.size();
                leftIndex = 0;
            }
        }
        return maxWeight;
    }

}