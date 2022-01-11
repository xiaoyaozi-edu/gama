package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 *
 * @author zhumingcheng
 * createTime: 2022-01-10 11:30
 */
public class _7_4_寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 两个数组，组合后的实际长度是奇数还是偶数
        int mod = (nums1.length & 1) + (nums2.length & 1) & 1;
        int middle = nums1.length + nums2.length / 2;

        int i = 0, j = 0;
        while (true) {
            if (i + j == middle) {
                break;
            }
            if (nums1[i] < nums2[j]) {
                if (i + j == middle) {
                    break;
                }
                i++;
            } else {
                j++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(3 & 1);
        System.out.println(2 & 1);
        System.out.println(1 & 1);
    }

}