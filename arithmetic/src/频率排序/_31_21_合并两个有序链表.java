package 频率排序;

import 链表.ListNode;

/**
 * tip: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 *
 * @author zhumingcheng
 * createTime: 2022-01-17 16:56
 */
public class _31_21_合并两个有序链表 {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode result = new ListNode(0);
            ListNode next = result;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    next.next = list1;
                    next = next.next;
                    list1 = list1.next;
                } else {
                    next.next = list2;
                    next = next.next;
                    list2 = list2.next;
                }
            }
            if (list1 == null) {
                next.next = list2;
            } else {
                next.next = list1;
            }
            return result.next;
        }
    }
}