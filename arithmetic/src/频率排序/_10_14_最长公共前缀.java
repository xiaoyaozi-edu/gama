package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * @author zhumingcheng
 * createTime: 2022-01-12 11:49
 */
public class _10_14_最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int length = 0;
        char temp;
        boolean flag = false;
        while (true) {
            temp = '0';
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() > length) {
                    if (temp == '0') {
                        temp = strs[i].charAt(length);
                    } else if (temp != strs[i].charAt(length)){
                        flag = true;
                        break;
                    }
                } else {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                return strs[0].substring(0, length);
            }
            length++;
        }
    }
}