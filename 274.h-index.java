/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        return new SortSolution().hIndex(citations);
    }
}

class SortSolution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int[] count = new int[len + 1];

        for (int citation : citations) {
            if (citation >= len) {
                count[len]++;
            } else {
                count[citation]++;
            }
        }

        int res = 0;
        for (int i = len; i >= 0; i--) {
            res += count[i];
            if (res >= i) {
                return i;
            }
        }
        return 0;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)

class BinarySearchSolution {
    public int hIndex(int[] citations) {
        int l = 0;
        int r = citations.length;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (Util.lessThan(citations, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l - 1;
    }
}
// Time Complexity: O(nlogn)
// Space Complexity: O(1)
// Note: the other way is to sort the array directly

class BruteForceSolution {
    public int hIndex(int[] citations) {
        int res = 0;
        for (int i = 0; i < citations.length; i++) {
            if (Util.lessThan(citations, i + 1)) {
                res++;
            }
        }
        return res;
    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Util {
    public static boolean lessThan(int[] citations, int level) {
        int count = 0;
        for (int citation : citations) {
            if (citation >= level) {
                count++;
            }
        }
        return count >= level;
    }
}

// @lc code=end
