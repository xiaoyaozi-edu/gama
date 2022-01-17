package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/container-with-most-water/
 *
 * @author zhumingcheng
 * createTime: 2022-01-14 15:16
 */
public class _26_11_盛最多水的容器 {
    public int maxArea(int[] height) {
        int length = height.length;
        // 左边最大值下标， 右边最大值下标，当前计算出的最大容器
        int left = 0, right = length - 1, result = Math.min(height[left], height[right]) * (right - left);
        // 左右下标开始遍历的节点
        int i = left, j = right;
        while (i < j) {
            if (height[left] < height[right]) {
                // 左边坐标较小，则从左边开始遍历
                while (++i < j) {
                    // 遍历出比当前大的坐标出来
                    if (height[i] > height[left]) {
                        // 开始计算出新的最大容器
                        result = Math.max(result, Math.min(height[i], height[right]) * (right - i));
                        // 更改下标
                        left = i;
                        // 如果左边高度大于右边了。就结束循环，准备遍历右边了。
                        if (height[left] > height[right]) {
                            break;
                        }
                    }
                }
            } else {
                // 右边坐标较小，则从右边开始遍历
                while (i < --j) {
                    // 遍历出比当前大的坐标出来
                    if (height[j] > height[right]) {
                        // 开始计算出新的最大容器
                        result = Math.max(result, Math.min(height[j], height[left]) * (j - left));
                        // 更改下标
                        right = j;
                        // 如果右边高度大于左边了。就结束循环，准备遍历左边了。
                        if (height[right] > height[left]) {
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}