package 频率排序;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-01-25 16:08
 */
public class _40_912_排序数组 {
    int[] temp;

    public int[] sortArray(int[] nums) {
        temp = new int[nums.length];
        sort(nums, 0, nums.length - 1);
        return temp;
    }

    public void sort(int[] nums, int begin, int end) {
        if (begin == end) {
            return;
        }
        int middle = begin + ((end - begin) >> 1);
        sort(nums, begin, middle);
        sort(nums, middle + 1, end);

        int i = begin, j = middle + 1, k = begin;
        while (i <= middle && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = nums[i++];
        }
        while (j <= end) {
            temp[k++] = nums[j++];
        }
        // 回填到原数组中
        for (i = begin; i <= end; i++) {
            nums[i] = temp[i];
        }
    }
}