/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int res = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && res != 0) {
                return res;
            }

            if (s.charAt(i) == ' ') {
                continue;
            }

            res++;
        }
        return res;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

// @lc code=end
