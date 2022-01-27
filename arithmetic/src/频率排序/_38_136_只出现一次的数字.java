package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/single-number/submissions/
 *
 * @author zhumingcheng
 * createTime: 2022-01-25 15:32
 */
public class _38_136_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}