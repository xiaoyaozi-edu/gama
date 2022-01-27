package 频率排序;

/**
 * tip: https://leetcode-cn.com/problems/palindrome-number/
 *
 * @author zhumingcheng
 * createTime: 2022-01-26 11:37
 */
public class _51_9_回文数 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        return s.equals(new StringBuffer(s).reverse().toString());
    }
}