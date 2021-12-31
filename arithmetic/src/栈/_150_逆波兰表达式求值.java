package 栈;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
 *
 * @author zhumingcheng
 * createTime: 2021-12-31 12:06
 */
public class _150_逆波兰表达式求值 {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int temp;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    // 注意，先pop出来的在表达式右边
                    stack.push(-(stack.pop() - stack.pop()));
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    // 注意，先pop出来的在表达式右边
                    temp = stack.pop();
                    stack.push(stack.pop() / temp);
                    break;
                default:
                    stack.push(Integer.valueOf(token));
                    break;
            }
        }
        return stack.pop();
    }
}