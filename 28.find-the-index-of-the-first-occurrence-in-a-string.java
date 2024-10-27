/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        return new TwoPointerSolution().strStr(haystack, needle);
    }
}

// h: haystack length, n: needle length
// Time Complexity: O(h*n)
// Space Complexity: O(h)
class BFSolution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (hLen < nLen) {
            return -1;
        }

        if (haystack.equals(needle)) {
            return 0;
        }

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, nLen + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

class TwoPointerSolution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int hIndex = 0;
        int nIndex = 0;

        while (hIndex < haystack.length()) {
            if (haystack.charAt(hIndex) == needle.charAt(nIndex)) {
                nIndex++;
            } else {
                nIndex -= hIndex + 1;
            }
            if (nIndex == needle.length()) {
                return hIndex - nIndex + 1;
            }
            hIndex++;
        }
        return -1;
    }
}

// @lc code=end
