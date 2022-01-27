package 频率排序;

import 链表.ListNode;

/**
 * tip: https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author zhumingcheng
 * createTime: 2022-01-25 19:05
 */
public class _41_206_反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode pre = null, next;
        while (head.next != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}