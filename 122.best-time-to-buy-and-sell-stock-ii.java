/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = prices[i] - prices[i - 1];
        }
        for (int profit : dp) {
            if (profit > 0) {
                res += profit;
            }
        }
        return res;
    }
}
// @lc code=end
