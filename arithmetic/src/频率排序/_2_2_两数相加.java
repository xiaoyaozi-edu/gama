package 频率排序;

import 链表.ListNode;

/**
 * tip: https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @author zhumingcheng
 * createTime: 2022-01-08 14:40
 */
public class _2_2_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode nextNode = result;
        // thisNum - 本次计算数字，包含了上次十位上的数字，1或0
        int thisNum = 0;
        // 边遍历，边生成新的链表，如果直接生成数字相加，可能会溢出
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                thisNum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                thisNum += l2.val;
                l2 = l2.next;
            }
            nextNode.next = new ListNode(thisNum % 10);
            thisNum = thisNum / 10;
            nextNode = nextNode.next;
        }
        // 最后看十位有没有1
        if (thisNum == 1) {
            nextNode.next = new ListNode(1);
        }
        return result.next;
    }
}