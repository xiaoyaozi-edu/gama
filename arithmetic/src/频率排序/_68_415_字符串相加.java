package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/add-strings/
 *
 * @author zhumingcheng
 * createTime: 2022-01-26 19:00
 */
public class _68_415_字符串相加 {
    public String addStrings(String num1, String num2) {
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();
        int i = num1Chars.length - 1;
        int j = num2Chars.length - 1;
        // k代表十位
        int k = 0, temp;
        StringBuilder builder = new StringBuilder("");
        while (i >= 0 && j >= 0) {
            temp = num1Chars[i--] + num2Chars[j--] + k - 2 * '0';
            k = temp / 10;
            builder.append(temp % 10);
        }
        while (i >= 0) {
            temp = num1Chars[i--] + k - '0';
            k = temp / 10;
            builder.append(temp % 10);
        }
        while (j >= 0) {
            temp = num2Chars[j--] + k - '0';
            k = temp / 10;
            builder.append(temp % 10);
        }
        if (k == 1) {
            builder.append(1);
        }
        return builder.reverse().toString();
    }
}