/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        return new MapSolution().intToRoman(num);
    }
}

// n: the number of digits
// Time Complexity: O(n)
// Space Complexity: O(n)
class SubtractionSolution {
    public String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int curIndex = 0;
        String res = "";
        while (num > 0) {
            if (num >= values[curIndex]) {
                num -= values[curIndex];
                res += symbols[curIndex];
            } else {
                curIndex++;
            }
        }
        return res;
    }
}

// n: the number of digits
// Time Complexity: O(n)
// Space Complexity: O(n)
class MapSolution {
    public String intToRoman(int num) {
        String res = "";
        Map<Integer, String[]> romanMap = generateRomanMapping();
        int curIndex = 0;
        while (num > 0) {
            int cur = num % 10;
            res = romanMap.get(curIndex + 1)[cur] + res;
            curIndex++;
            num /= 10;
        }
        return res;
    }

    private static Map<Integer, String[]> generateRomanMapping() {
        Map<Integer, String[]> romanMap = new HashMap<>();
        romanMap.put(1, new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" });
        romanMap.put(2, new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" });
        romanMap.put(3, new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" });
        romanMap.put(4, new String[] { "", "M", "MM", "MMM" });
        return romanMap;
    }
}
// @lc code=end
