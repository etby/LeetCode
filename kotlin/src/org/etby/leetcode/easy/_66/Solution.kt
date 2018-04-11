package org.etby.leetcode.easy._66

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var result = IntArray(digits.size + 1)

        var plusOne = true
        for (offset in 1..digits.size) {
            var sum = digits[digits.size - offset]
            if (plusOne) {
                sum++
            }

            result[result.size - offset] = sum % 10
            plusOne = sum >= 10
        }

        if (plusOne) {
            result[0] = 1
            return result
        }

        return result.copyOfRange(1, result.size)
    }
}