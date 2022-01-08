package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/binary-search/
 *
 * @author zhumingcheng
 * createTime: 2022-01-08 15:58
 */
public class _3_704_二分查找 {
    public int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1, k;
        while (j >= i) {
            // 防止溢出，如果用位移，则需要注意，位移的运算优先级是很低的，在 + - 之后
            k = ((j - i) >> 1) + i;
            if (nums[k] == target) {
                return k;
            } else if (nums[k] < target) {
                i = k + 1;
            } else {
                j = k - 1;
            }
        }
        return -1;
    }
}