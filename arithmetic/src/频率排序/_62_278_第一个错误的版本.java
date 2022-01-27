package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/first-bad-version/
 *
 * @author zhumingcheng
 * createTime: 2022-01-26 18:16
 */
public class _62_278_第一个错误的版本 {
    public static int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int n) {
        return n != 0;
    }
}