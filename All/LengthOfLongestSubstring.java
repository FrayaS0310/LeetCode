package All;

import java.util.HashSet;

/**
 * 考点：HashSep、滑动窗口、
 * 需要考虑两个入参均为空的情况
 * 线性表是最常用的存储结构，线性表的每个单元成为元素，元素拥有一个数据及一个地址
 * 两种物理存储方式：顺序存储方式和链式存储方式
 */

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int res = 0, left = 0, right = 0;
        HashSet<Character> m = new HashSet<>();
        while (right < s.length()) {
            if (m.contains(s.charAt(right))) {
                m.add(s.charAt(right));
                right = right + 1;
                res = Math.max(res, m.size());
            } else {
                m.remove(s.charAt(left));
                left = left + 1;
            }
        }
        return res;
    }

}
