/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                return new int[] { l + 1, r + 1 };
            }

            if (sum > target) {
                r--;
            } else {
                l++;
            }

        }
        return new int[2];
    }
}
// @lc code=end
