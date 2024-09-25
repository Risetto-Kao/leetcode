/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        return new ClearSolution().removeDuplicates(nums);
    }
}

class ClearSolution {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[res] = nums[i];
                res++;
            }
        }

        return res;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)

class BFSolution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int res = 1;
        int[] tmp = new int[nums.length];
        tmp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                tmp[res] = nums[i];
                res++;
            }
        }

        for (int i = 0; i < res; i++) {
            nums[i] = tmp[i];
        }

        return res;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)
// @lc code=end
