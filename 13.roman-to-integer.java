/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int cur = map.get(s.charAt(i));
            if (i != len - 1 && cur < map.get(s.charAt(i + 1))) {
                res -= cur;
                continue;
            }
            res += cur;
        }
        return res;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

// @lc code=end
