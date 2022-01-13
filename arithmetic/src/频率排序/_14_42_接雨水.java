package 频率排序;

import java.util.Stack;

/**
 * tip: https://leetcode-cn.com/problems/trapping-rain-water/
 *
 * @author zhumingcheng
 * createTime: 2022-01-13 17:28
 */
public class _14_42_接雨水 {
    public int trap(int[] height) {
        int result = 0;
        // 最大值下标
        int maxIndx = -1;
        for (int i = 0; i < height.length; i++) {
            if (maxIndx == -1) {
                // 左侧最大值为0，i高度不为0，则就是最大值，后面可直接跳过
                if (height[i] != 0) {
                    maxIndx = i;
                }
                continue;
            }
            // 如果大于左边值，需要计算
            if (height[i] > height[i - 1]) {
                // 如果大等于最大值，那么左边原本的数据都可以计算后丢弃
                if (height[i] >= height[maxIndx]) {
                    for (int j = maxIndx + 1; j < i; j++) {
                        result += height[maxIndx] - height[j];
                    }
                    // 更新最大值下标
                    maxIndx = i;
                } else {
                    // 小于，则匹配到比自己大的就需要结束
                    int k = i - 1;
                    while (height[k] < height[i]) {
                        result += height[i] - height[k];
                        height[k] = height[i];
                        k--;
                    }
                }
            }
        }
        return result;
    }

    /**
     * tip: 利用栈的低配版，耗时，耗额外空间
     *
     * @author zhumingcheng
     * createTime: 2022-01-13 18:55
     */
    public int trap1(int[] height) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        int result = 0;
        int leftMax = 0;
        for (int i = 0; i < height.length; i++) {
            // 左侧为空，高度为0，直接跳过
            if (height[i] == 0 && stack.isEmpty()) {
                continue;
            }
            if (stack.isEmpty()) {
                stack.push(height[i]);
                leftMax = height[i];
            } else {
                // 如果大于左边值，需要计算
                if (height[i] > stack.peek()) {
                    // 如果大等于最大值，那么左边原本的数据都可以计算后丢弃
                    if (height[i] >= leftMax) {
                        while (!stack.isEmpty()) {
                            result += leftMax - stack.pop();
                        }
                        leftMax = height[i];
                    } else {
                        // 小于最大值，那么一直取到比自己大的数字即可，计算后，不能丢弃，需要回填
                        while (height[i] > stack.peek()) {
                            tempStack.push(stack.pop());
                        }
                        // 计算
                        while (!tempStack.isEmpty()) {
                            result += height[i] - tempStack.pop();
                            // 回填
                            stack.push(height[i]);
                        }
                    }
                }
                // 小等于左边值，或则上面情况处理完毕，在这里push
                stack.push(height[i]);
            }
        }
        return result;
    }
}