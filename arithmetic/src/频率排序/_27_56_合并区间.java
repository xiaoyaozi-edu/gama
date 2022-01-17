package 频率排序;

import java.util.Arrays;
import java.util.Comparator;

/**
 * tip: https://leetcode-cn.com/problems/merge-intervals/
 *
 * @author zhumingcheng
 * createTime: 2022-01-14 17:15
 */
public class _27_56_合并区间 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(m -> m[0]));
        int maxIndex = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[maxIndex][1]) {
                intervals[maxIndex][1] = Math.max(intervals[i][1], intervals[maxIndex][1]);
            } else {
                intervals[++maxIndex] = intervals[i];
            }
        }
        return Arrays.copyOf(intervals, maxIndex + 1);
    }
}