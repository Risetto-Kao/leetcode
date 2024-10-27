/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start

import java.util.List;

// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (len <= 1 || numRows <= 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            list.add(new StringBuilder());
        }

        int curRow = 0;
        boolean isDeclining = false;
        for (char c : s.toCharArray()) {
            list.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                isDeclining = !isDeclining;
            }
            curRow += isDeclining ? 1 : -1;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : list) {
            res.append(sb);
        }
        return res.toString();
    }
}
// @lc code=end
