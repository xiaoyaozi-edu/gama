package 链表;

/**
 * tip: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 *
 * @author zhumingcheng
 * createTime: 2021-12-23 19:38
 */
public class _237_删除链表中的节点 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}