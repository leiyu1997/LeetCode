/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int step = 1;
        boolean exit = false;
        for (int i = 0, j = 0, num = 1; num <= n * n; num++) {
            res[i][j] = num;
            if (j + step < n && j + step >= 0 && res[i][j + step] == 0) {
                j = j + step;
                exit = false;
            } else if (i + step < n && i + step >= 0 && res[i + step][j] == 0) {
                i = i + step;
                exit = false;
            } else {
                step = step * -1;
                num--;
                if (exit == true) {
                    return res;
                }
                exit = true;
            }
        }
        return res;
    }
}
// @lc code=end
