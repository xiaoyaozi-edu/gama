package 频率排序;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/submissions/
 *
 * @author zhumingcheng
 * createTime: 2022-01-08 17:36
 */
public class _4_xx_用两个栈实现队列 {
    class CQueue {
        // 其中一个只放，另一个只取
        private final Stack<Integer>[] stackArray = new Stack[]{new Stack<>(), new Stack<>()};

        public CQueue() {}

        public void appendTail(int value) {
            stackArray[0].push(value);
        }

        public int deleteHead() {
            if (!stackArray[1].isEmpty()) {
                return stackArray[1].pop();
            } else {
                while (!stackArray[0].isEmpty()) {
                    stackArray[1].push(stackArray[0].pop());
                }
                if (!stackArray[1].isEmpty()) {
                    return stackArray[1].pop();
                } else {
                    return -1;
                }
            }
        }
    }
}