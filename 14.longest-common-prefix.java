/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {

            int index = 0;
            String cur = strs[i];

            while (index < cur.length() && index < res.length() && cur.charAt(index) == res.charAt(index)) {
                index++;
            }

            res = res.substring(0, index);
            if (res.isEmpty()) {
                return "";
            }
        }
        return res;
    }
}
// @lc code=end
