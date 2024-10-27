/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int buyIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[buyIndex];
            if (profit < 0) {
                buyIndex = i;
            }
            res = Math.max(res, profit);
        }
        return res;
    }
}
// @lc code=end
