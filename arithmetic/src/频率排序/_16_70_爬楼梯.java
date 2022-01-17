package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/climbing-stairs/
 *
 * @author zhumingcheng
 * createTime: 2022-01-13 19:03
 */
public class _16_70_爬楼梯 {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int last = 1, result = 2, temp;
        for (int i = 3; i <= n; i++) {
            temp = last;
            last = result;
            result += temp;
        }
        return result;
    }
}