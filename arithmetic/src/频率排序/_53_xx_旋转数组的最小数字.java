package 频率排序;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-01-26 15:17
 */
public class _53_xx_旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return numbers[i + 1];
            }
        }
        return numbers[0];
    }
}