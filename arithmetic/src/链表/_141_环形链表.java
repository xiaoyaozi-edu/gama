package 链表;

/**
 * tip: https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @author zhumingcheng
 * createTime: 2021-12-24 17:38
 */
public class _141_环形链表 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode fastNode = head.next.next, slowNode = head.next;
        while (true) {
            if (fastNode.next == null || fastNode.next.next == null) {
                return false;
            }
            if (fastNode.next.next == slowNode.next) {
                return true;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
    }
}