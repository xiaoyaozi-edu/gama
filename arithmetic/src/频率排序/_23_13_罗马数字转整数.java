package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/roman-to-integer/
 *
 * @author zhumingcheng
 * createTime: 2022-01-14 11:51
 */
public class _23_13_罗马数字转整数 {
    public int romanToInt(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            switch (chars[i]) {
                case 'I':
                    if (i + 1 < length && chars[i + 1] == 'V') {
                        result += 4;
                        i++;
                    } else if (i + 1 < length && chars[i + 1] == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;
                case 'X':
                    if (i + 1 < length && chars[i + 1] == 'L') {
                        result += 40;
                        i++;
                    } else if (i + 1 < length && chars[i + 1] == 'C') {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                    break;
                case 'C':
                    if (i + 1 < length && chars[i + 1] == 'D') {
                        result += 400;
                        i++;
                    } else if (i + 1 < length && chars[i + 1] == 'M') {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}