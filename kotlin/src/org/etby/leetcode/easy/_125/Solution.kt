package org.etby.leetcode.easy._125

class Solution {
    fun isPalindrome(s: String): Boolean {
        val chars = s.toLowerCase().toCharArray().filter { isValid(it) }
        var l = 0
        var r = chars.size - 1
        while (l < r) {
            val lc = chars[l++]
            val rc = chars[r--]

            if (lc != rc) {
                return false
            }
        }

        return true
    }

    fun isValid(c: Char): Boolean {
        if (c in 'a'..'z') return true
        if (c in 'A'..'Z') return true
        if (c in '0'..'9') return true
        return false
    }
}