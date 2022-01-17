package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 *
 * @author zhumingcheng
 * createTime: 2022-01-14 12:14
 */
public class _24_121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0, tempMax = 0;
        for (int i = 0; i < prices.length; i++) {
            // 寻找到最小数了，之前的最大差距需要计算出来
            if (prices[i] < min) {
                // 计算值
                tempMax = Math.max(max - min, tempMax);
                min = prices[i];
                max = 0;
            } else {
                max = Math.max(prices[i], max);
            }
        }
        // 最后在计算一次最大值
        return Math.max(max - min, tempMax);
    }
}