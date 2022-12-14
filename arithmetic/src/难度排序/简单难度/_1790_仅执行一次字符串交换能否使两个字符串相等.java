package 难度排序.简单难度;

/**
 * tip: https://leetcode-cn.com/problems/check-if-one-string-swap-can-make-strings-equal/
 *
 * @author zhumingcheng
 * createTime: 2022-02-11 19:12
 */
public class _1790_仅执行一次字符串交换能否使两个字符串相等 {
    public boolean areAlmostEqual(String s1, String s2) {
        int length = s1.length();
        int count = 0;
        int[] index = new int[2];
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count > 1) {
                    return false;
                } else {
                    index[count] = i;
                    count++;
                }
            }
        }
        if (count == 0) return true;
        if (count == 1) return false;
        if (count == 2) {
            return s1.charAt(index[0]) == s2.charAt(index[1]) &&
                    s2.charAt(index[0]) == s1.charAt(index[1]);
        }
        return false;
    }
}