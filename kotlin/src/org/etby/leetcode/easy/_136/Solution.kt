package org.etby.leetcode.easy._136

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var targetIndex = 0
        if (nums.size < 3) {
            return nums[targetIndex]
        }
        var index = targetIndex + 1
        while (targetIndex < nums.size && index < nums.size) {
            val target = nums[targetIndex]
            val cur = nums[index]
            if (target == cur) {
                // 找到
                nums[index] = nums[targetIndex + 1]
                nums[targetIndex + 1] = cur

                targetIndex += 2
                index = targetIndex
            }
            index++
        }
        return nums[targetIndex]
    }
}