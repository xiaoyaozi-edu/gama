package 链表;

/**
 * tip: https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author zhumingcheng
 * createTime: 2021-12-24 17:23
 */
public class _206_反转链表 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode temp = null, next;
        while (head.next != null) {
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        head.next = temp;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = reverseList(listNode1);
        System.out.println(listNode);
    }
}