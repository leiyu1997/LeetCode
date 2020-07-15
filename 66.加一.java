import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            }
            digits[i]++;
            return digits;
        }
        if (digits[0] == 0) {
            int[] d = new int[digits.length + 1];
            d[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                d[i + 1] = digits[i];
            }
            return d;
        }
        return digits;
    }
}
// @lc code=end
