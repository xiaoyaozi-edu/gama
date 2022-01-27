package 频率排序;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-01-26 19:54
 */
public class _69_26_删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[left] < nums[i] && (++left != i)) {
                // ++left提到条件判断里，如果下标相同，则不用交换，如果不同，则需要交换位置
                // 交换: ++left 与 i,
                nums[left] = nums[left] ^ nums[i];
                nums[i] = nums[left] ^ nums[i];
                nums[left] = nums[left] ^ nums[i];
            }
        }
        return left + 1;
    }
}