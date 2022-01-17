package 频率排序;

import java.util.Arrays;

/**
 * tip: https://leetcode-cn.com/problems/3sum-closest/
 *
 * @author zhumingcheng
 * createTime: 2022-01-17 16:44
 */
public class _30_16_最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int j, k, sum;
        int length = nums.length, best = 1000000;
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            j = i + 1;
            k = length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                // 值过大，k左移
                if (sum > target) {
                    // k先-1
                    k--;
                    // 如果k - 1 之后和k相同，则继续-1
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else {
                    j++;
                    // 值过小，j右移
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
        }
        return best;
    }
}