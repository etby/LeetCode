package org.etby.leetcode.easy._35

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var result = 0

        while (result < nums.size) {
            if (nums[result] >= target) {
                break
            }
            result++
        }

        return result
    }
}