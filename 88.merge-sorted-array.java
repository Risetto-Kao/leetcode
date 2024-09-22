/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mPointer = m - 1;
        int nPointer = n - 1;
        int index = m + n - 1;
        while (mPointer >= 0 && nPointer >= 0) {
            if (nums1[mPointer] <= nums2[nPointer]) {
                nums1[index] = nums2[nPointer];
                nPointer--;
            } else {
                nums1[index] = nums1[mPointer];
                mPointer--;
            }
            index--;
        }

        while (nPointer >= 0) {
            nums1[index] = nums2[nPointer];
            nPointer--;
            index--;
        }
    }
}
// Time Complexity: O(m+n)
// Space Complexity: O(1)

// @lc code=end
