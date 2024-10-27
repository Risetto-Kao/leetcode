/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r) {
            int lHeight = height[l];
            int rHeight = height[r];
            int area = Math.min(lHeight, rHeight) * (r - l);
            res = Math.max(res, area);
            if (lHeight < rHeight) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
// @lc code=end
