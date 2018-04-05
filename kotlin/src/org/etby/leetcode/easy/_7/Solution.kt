package org.etby.leetcode.easy._7

class Solution {
    fun reverse(n: Int): Int {
        var x = n
        var result = 0

        while (x != 0) {
            val tail = x % 10
            val newResult = result * 10 + tail
            if ((newResult - tail) / 10 != result) {
                return 0
            }
            result = newResult
            x /= 10
        }

        return result
    }
}