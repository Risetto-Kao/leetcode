/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int sIndex = 0;
        for (char c : t.toCharArray()) {

            if (sIndex == s.length()) {
                return true;
            }

            if (c == s.charAt(sIndex)) {
                sIndex++;
            }

        }
        return sIndex == s.length();
    }
}
// @lc code=end
