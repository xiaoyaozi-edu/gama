package 链表;

/**
 * tip: https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author zhumingcheng
 * createTime: 2021-12-24 17:23
 */
public class _206_反转链表 {

    public static ListNode reverseList(ListNode head) {
        ListNode temp = null, next;
        while (head != null) {
            next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }

}