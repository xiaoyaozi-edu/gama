package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/maximum-subarray/
 *
 * @author zhumingcheng
 * createTime: 2022-01-21 11:44
 */
public class _37_53_最大子数组和 {
    public int maxSubArray(int[] nums) {
        int max = nums[0], left = Math.max(nums[0], 0), length = nums.length;
        for (int i = 1; i < length; i++) {
            max = Math.max(max, left + nums[i]);
            left = Math.max(left + nums[i], 0);
        }
        return max;
    }
}