package 二叉树;

/**
 * tip: https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 10:52
 */
public class _114_二叉树展开为链表 {

    public void flatten(TreeNode root) {
        // 对于当前节点，如果其左子节点不为空，则在其左子树中找到最右边的节点，作为前驱节点，将当前节点的右子节点赋给前驱节点的右子节点，
        // 然后将当前节点的左子节点赋给当前节点的右子节点，并将当前节点的左子节点设为空。对当前节点处理结束后，继续处理链表中的下一个节点，直到所有节点都处理结束。
        TreeNode predecessor;
        while (root != null) {
            if (root.left != null) {
                // 左节点不为null，则寻找右节点的前驱节点
                predecessor = root.left;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                // 将右节点赋值给前驱节点右子树
                predecessor.right = root.right;
                // 左子树赋值到右子树上
                root.right = root.left;
                // 左子树设为null
                root.left = null;
            }
            // 左子树为空，无需变化，直接往右子树上位移
            root = root.right;
        }
    }

}