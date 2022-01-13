package 频率排序;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author zhumingcheng
 * createTime: 2022-01-13 19:01
 */
public class _15_20_有效的括号 {

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