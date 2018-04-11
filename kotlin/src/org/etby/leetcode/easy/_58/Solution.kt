package org.etby.leetcode.easy._58

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var result = 0
        var sum = 0

        for (c in s.toCharArray()) {
            if (c == ' ') {
                sum = 0
            } else {
                sum++
            }

            if (sum > 0) {
                result = sum
            }
        }

        return result
    }
}