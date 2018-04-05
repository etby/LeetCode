package org.etby.leetcode.easy._9

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }

        val array = x.toString().toCharArray()

        var l = 0
        var r = array.size - 1

        while (l < r) {
            if (array[l] != array[r]) {
                break
            }

            l++
            r--
        }

        return array[l] == array[r]
    }
}