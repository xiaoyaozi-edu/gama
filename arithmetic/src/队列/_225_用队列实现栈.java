package 队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * tip: https://leetcode-cn.com/problems/implement-stack-using-queues/
 *
 * @author zhumingcheng
 * createTime: 2021-12-31 17:49
 */
public class _225_用队列实现栈 {

    class MyStack {

        private final Queue<Integer>[] queueArray = new Queue[]{new LinkedList<>(), new LinkedList<>()};
        private int isUseIndex = 1;

        public MyStack() {
        }

        public void push(int x) {
            queueArray[1 - isUseIndex].offer(x);
            while (!queueArray[isUseIndex].isEmpty()) {
                queueArray[1 - isUseIndex].offer(queueArray[isUseIndex].poll());
            }
            isUseIndex = 1 - isUseIndex;
        }

        public int pop() {
            return queueArray[isUseIndex].poll();
        }

        public int top() {
            return queueArray[isUseIndex].peek();
        }

        public boolean empty() {
            return queueArray[isUseIndex].size() == 0 && queueArray[1 - isUseIndex].size() == 0;
        }
    }
}