package 频率排序;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * tip: https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * @author zhumingcheng
 * createTime: 2022-01-08 18:49
 */
public class _6_3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        int maxLength = 0;
        Character tempChar;
        for (int i = 0; i < chars.length; i++) {
            if (set.contains(chars[i])) {
                // 得出最大值
                maxLength = Math.max(maxLength, queue.size());
                // 出队
                while ((tempChar = queue.poll()) != chars[i]) {
                    // set移出
                    set.remove(tempChar);
                }
            }
            // 入队
            queue.offer(chars[i]);
            set.add(chars[i]);
        }
        return Math.max(maxLength, queue.size());
    }
}