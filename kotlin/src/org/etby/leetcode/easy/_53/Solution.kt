package org.etby.leetcode.easy._53

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var max = nums[0]
        var sum = 0
        for (i in nums) {
            sum += i
            if (sum > max) {
                max = sum
            }
            if (sum < 0) {
                sum = 0
            }
        }

        return max
    }
}