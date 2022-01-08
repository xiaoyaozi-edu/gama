package 二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 10:45
 */
public class _559_N叉树的最大深度 {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int maxHeigh = 0, levelLength = 1;
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.children != null && root.children.size() > 0) {
                for (int i = 0; i < root.children.size(); i++) {
                    queue.offer(root.children.get(i));
                }
            }
            if (--levelLength == 0) {
                maxHeigh++;
                levelLength = queue.size();
            }
        }
        return maxHeigh;
    }

}