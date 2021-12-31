package 栈;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author zhumingcheng
 * createTime: 2021-12-24 17:49
 */
public class _20_有效的括号 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] split = s.toCharArray();
        for (int i = 0; i < split.length; i++) {
            if ('(' == split[i] || '[' == split[i] || '{' == split[i]) {
                stack.push(split[i]);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (')' == (split[i]) && stack.pop() != '(') {
                    return false;
                }
                if (']' == (split[i]) && stack.pop() != '[') {
                    return false;
                }
                if ('}' == (split[i]) && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.peek());
    }
}