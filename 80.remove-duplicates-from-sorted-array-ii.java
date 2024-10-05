/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int currentValue = Integer.MIN_VALUE;
        int count = 0;
        int nextIndex = 0;

        for (int i = 0; i < len; i++) {
            if (currentValue != nums[i]) {
                currentValue = nums[i];
                count = 1;
                nums[nextIndex] = nums[i];
                nextIndex++;
                continue;
            }
            if (count >= 2) {
                continue;
            }
            count++;
            nums[nextIndex] = nums[i];
            nextIndex++;
        }

        return nextIndex;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

// @lc code=end
