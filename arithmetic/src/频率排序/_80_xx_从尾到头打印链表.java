package 频率排序;

import 链表.ListNode;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * @author zhumingcheng
 * createTime: 2022-01-27 10:57
 */
public class _80_xx_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int length = stack.size();
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}