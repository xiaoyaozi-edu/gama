package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/move-zeroes/
 *
 * @author zhumingcheng
 * createTime: 2022-01-26 11:07
 */
public class _47_283_移动零 {
    public void moveZeroes(int[] nums) {
        int left = -1, length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0 && left < 0) {
                left = i;
            }
            if (nums[i] != 0 && left >= 0) {
                // 交换
                nums[i] = nums[i] ^ nums[left];
                nums[left] = nums[i] ^ nums[left];
                nums[i] = nums[i] ^ nums[left];
                left++;
            }
        }
    }
}