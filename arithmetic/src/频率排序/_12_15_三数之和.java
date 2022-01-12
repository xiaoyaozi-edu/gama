package 频率排序;

import java.util.*;

/**
 * tip: https://leetcode-cn.com/problems/3sum/
 *
 * @author zhumingcheng
 * createTime: 2022-01-12 18:19
 */
public class _12_15_三数之和 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // 去重set
        Set<String> set = new HashSet<>();
        // 第二个数和第三个数之和 = 0 - nums[i]
        int towThirdSum, a, b, c;
        Integer two;
        String tempString;
        // key-缺失的第三个数，value-第二个数˚
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            towThirdSum = -nums[i];
            // 数组置空
            map.clear();
            for (int j = i + 1; j < nums.length; j++) {
                two = map.get(nums[j]);
                if (two == null) {
                    map.put(towThirdSum - nums[j], nums[j]);
                } else {
                    // 找到值，可以不删除，后面可以去重
                    a = nums[i];
                    b = two;
                    c = nums[j];
                    if (a > b) {
                        a = a^b;
                        b = a^b;
                        a = a^b;
                    }
                    if (a > c) {
                        a = a^c;
                        c = a^c;
                        a = a^c;
                    }
                    if (b > c) {
                        b = b^c;
                        c = b^c;
                        b = b^c;
                    }
                    // abc 现在递增了
                    tempString = "" + a + b + c;
                    if (!set.contains(tempString)) {
                        // 新组合
                        list.add(Arrays.asList(a, b, c));
                        set.add(tempString);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}