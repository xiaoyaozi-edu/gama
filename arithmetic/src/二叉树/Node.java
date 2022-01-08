package 二叉树;

import java.util.List;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-01-06 09:50
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}