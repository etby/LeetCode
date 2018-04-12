package org.etby.leetcode.easy._67

class Solution {
    fun addBinary(a: String, b: String): String {
        val aChars = a.toCharArray()
        val bChars = b.toCharArray()
        val maxLength = if (aChars.size > bChars.size) aChars.size else bChars.size
        val result = IntArray(maxLength + 1)

        var offset = 1
        var plus = 0
        while (offset <= maxLength) {
            var sum = plus
            if (aChars.size >= offset) {
                sum += aChars[aChars.size - offset] - '0'
            }
            if (bChars.size >= offset) {
                sum += bChars[bChars.size - offset] - '0'
            }
            result[result.size - offset] = sum % 2
            plus = sum / 2

            offset++
        }
        result[result.size - offset] = plus

        val index = result.indexOf(1)
        if (index < 0) {
            return "0"
        }

        return result.copyOfRange(index, result.size).joinToString(separator = "")
    }

}