package org.etby.leetcode.easy._28

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var result = -1
        val chars = haystack.toCharArray()
        val target = needle.toCharArray()

        if (target.isEmpty()) {
            return 0
        }
        if (chars.size < target.size) {
            return result
        }

        for (i in 0..(chars.size - target.size)) {
            if (checkEquals(i, chars, target)) {
                result = i
                break
            }
        }

        return result
    }

    fun checkEquals(offset: Int, chars: CharArray, target: CharArray): Boolean {
        var result = true

        for (i in 0 until target.size) {
            if (chars[i + offset] != target[i]) {
                result = false
                break
            }
        }

        return result
    }
}