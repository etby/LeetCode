package org.etby.leetcode.easy._26

class Solution {
    fun removeDuplicates(nums: IntArray?): Int {
        if (nums == null || nums.size < 2) {
            return nums?.size ?: 0
        }

        var result = nums.size
        var i = 0
        while (i < result) {
            if (checkEquals(i, result, nums)) {
                result--
                moveNum(i + 1, result, nums)
            } else {
                i++
            }
        }

        return result
    }

    fun checkEquals(index: Int, size: Int, nums: IntArray): Boolean {
        if (index < size - 1) {
            return nums[index] == nums[index + 1]
        }
        return false
    }

    fun moveNum(index: Int, size: Int, nums: IntArray) {
        var i = index
        var tmp = 0
        while (i != size) {
            tmp = nums[i + 1]
            nums[i + 1] = nums[i]
            nums[i] = tmp
            i++
        }
    }

}