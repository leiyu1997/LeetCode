/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            len++;
            if (ch[i] == ' ') {
                if (i + 1 < s.length() && ch[i + 1] == ' ' || i + 1 == s.length()) {
                    len--;
                    continue;
                }
                len = 0;
            }
        }
        return len;
    }
}
// @lc code=end
