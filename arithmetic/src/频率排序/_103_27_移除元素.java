package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/remove-element/
 *
 * @author zhumingcheng
 * createTime: 2022-02-10 18:25
 */
public class _103_27_移除元素 {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }
}