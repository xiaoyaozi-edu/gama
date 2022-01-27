package 频率排序;

import java.util.Arrays;

/**
 * tip: https://leetcode-cn.com/problems/valid-triangle-number/
 *
 * @author zhumingcheng
 * createTime: 2022-01-19 14:19
 */
public class _35_611_有效三角形的个数 {
    public static int triangleNumber(int[] nums) {
        // 先排序，解决两边之和大于第三边
        Arrays.sort(nums);
        int result = 0, length = nums.length;
        for (int i = 0; i < length; i++) {
            int k = i + 1;
            for (int j = k; j < length; j++) {
                while (k < length - 1 && nums[k + 1] - nums[j] < nums[i]) {
                    k++;
                }
                result += Math.max(k - j, 0);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[]{0, 0, 0}));
    }
}