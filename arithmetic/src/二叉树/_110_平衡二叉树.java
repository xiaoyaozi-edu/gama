package 二叉树;

/**
 * tip: https://leetcode-cn.com/problems/balanced-binary-tree/
 *
 * @author zhumingcheng
 * createTime: 2022-01-07 10:09
 */
public class _110_平衡二叉树 {

    public boolean isBalanced(TreeNode root) {
        return hight(root) >= 0;
    }

    public int hight(TreeNode node) {
        if (node == null) { return 0; }
        int left = hight(node.left), right = hight(node.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}