package org.etby.leetcode.easy._69

class Solution {
    fun mySqrt(x: Int): Int {
        if (x <= 0) {
            return 0
        }

        var left: Long = 0
        var right: Long = x.toLong() / 2 + 1

        while (left <= right) {
            val mid = (left + right) / 2
            val target: Long = mid * mid

            when {
                target < x -> left = mid + 1
                target > x -> right = mid - 1
                else -> return mid.toInt()
            }
        }

        return right.toInt()
    }
}