//在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 示例 1: 
//
// 输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4 
//
// 说明: 
//
// 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。 
// Related Topics 堆 分治算法 
// 👍 704 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for (int i = (n - 2) / 2; i >= 0; i--) {
            sink(nums, i, n);
        }
        for (; n > 0; n--) {
            exch(nums, 0, n - 1);
            sink(nums, 0, n - 1);
        }
        return nums[nums.length - k];
    }

    private void sink(int[] nums, int k, int n) {
        int l = 2 * k + 1;
        if (l + 1 < n && nums[l + 1] > nums[l]) l++;
        if (l < n && nums[l] > nums[k]) {
            exch(nums, l, k);
            sink(nums, l, n);
        }
    }

    private void exch(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
