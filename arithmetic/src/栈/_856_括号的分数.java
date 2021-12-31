package 栈;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/score-of-parentheses/
 *
 * @author zhumingcheng
 * createTime: 2021-12-31 10:02
 */
public class _856_括号的分数 {

    public int scoreOfParentheses(String s) {
        if (s == null) { return 0; }
        char[] chars = s.toCharArray();
        int i, j;
        Stack<Integer> stack = new Stack<>();
        for (char temp : chars) {
            if (temp == '(') {
                stack.push(0);
            } else {
                i = stack.pop();
                if (i == 0) {
                    stack.push(1);
                } else {
                    j = stack.pop();
                    while (j != 0) {
                        i = i + j;
                        j = stack.pop();
                    }
                    stack.push(2 * i);
                }
            }
        }
        i = 0;
        while (!stack.isEmpty()) {
            i += stack.pop();
        }
        return i;
    }
}