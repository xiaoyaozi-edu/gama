package 频率排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * tip: https://leetcode-cn.com/problems/3sum/
 *
 * @author zhumingcheng
 * createTime: 2022-01-12 18:19
 */
public class _12_15_三数之和 {
    public static List<List<Integer>> threeSum(int[] nums) {
        // 先排序，方便有序去重操作
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            // 如果第一个数 > 0 或则 如果和上次数相同，直接跳过
            if (nums[i] > 0 || (i > 0 && nums[i - 1] == nums[i])) {
                continue;
            }
            // 不相同，开始遍历
            int k = length - 1;
            for (int j = i + 1; j < length; j++) {
                // 如果和上次数相同，直接跳过
                if (j - 1 > i && nums[j - 1] == nums[j]) {
                    continue;
                }
                // 从末尾往回遍历，如果找到，则说明存在
                while (k > j && nums[j] + nums[k] > -nums[i]) {
                    k--;
                }
                // 如果j k碰头，则可以结束循环
                if (k == j) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0, 0, 0, 0, 0}));
    }
}