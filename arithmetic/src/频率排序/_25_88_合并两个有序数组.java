package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/merge-sorted-array/
 *
 * @author zhumingcheng
 * createTime: 2022-01-14 14:52
 */
public class _25_88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m > 0 && n > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[i] = nums1[m - 1];
                    m--;
                } else {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            } else if (m == 0) {
                // m为0，但是要把n的数据移过来，还得继续
                nums1[i] = nums2[n - 1];
                n--;
            }
            // n为0，说明m的已经在m里面了，无需处理
        }
    }
}