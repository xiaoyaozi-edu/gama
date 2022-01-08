package 频率排序;

import java.util.HashMap;

/**
 * tip: https://leetcode-cn.com/problems/two-sum/
 *
 * @author zhumingcheng
 * createTime: 2022-01-08 14:39
 */
public class _1_1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer index;
        for (int i = 0; i < nums.length; i++) {
            index = map.get(nums[i]);
            if (index != null) {
                return new int[]{index, i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }
}