package 频率排序;

import java.util.Arrays;

/**
 * tip: https://leetcode-cn.com/problems/contains-duplicate/submissions/
 *
 * @author zhumingcheng
 * createTime: 2022-01-12 09:43
 */
public class _9_217_存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        int[] hash = new int[length];
        Arrays.fill(hash, 0);
        int index, zeroCount = 0;
        for (int i = 0; i < length; i++) {
            // 处理特殊0
            if (nums[i] == 0) {
                if (zeroCount > 0) {
                    return true;
                } else {
                    zeroCount++;
                }
                continue;
            }
            // 找出下标
            index = nums[i] % length;
            if (index < 0) {
                index += length;
            }
            // 判断下标值
            while (true) {
                if (hash[index] == 0) {
                    hash[index] = nums[i];
                    break;
                } else if (hash[index] == nums[i]) {
                    return true;
                } else {
                    index++;
                    if (index == length) {
                        index = 0;
                    }
                }
            }
        }
        return false;
    }
}