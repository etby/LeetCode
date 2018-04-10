package org.etby.leetcode.easy._27

class Solution {
    fun removeElement(nums: IntArray?, delInt: Int): Int {
        if (nums == null) {
            return 0
        }

        var result = nums.size
        var i = 0
        var offset = 0

        while (i < result) {
            val target = nums[i + offset]
            if (target == delInt) {
                offset++
                result--
                continue
            }

            nums[i] = target
            i++
        }
        return result
    }

}