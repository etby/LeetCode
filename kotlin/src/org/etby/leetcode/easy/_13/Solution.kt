package org.etby.leetcode.easy._13

class Solution {
    fun romanToInt(s: String): Int {
        var result = 0
        val data = s.toCharArray().map { singleRomanToInt(it) }
        for (i in 0 until data.size) {
            if (i == data.size - 1) {
                result += data[i]
                break
            }

            val cur = data[i]
            val next = data[i + 1]

            if (cur < next) {
                result -= data[i]
            } else {
                result += data[i]
            }
        }

        return result
    }

    fun singleRomanToInt(c: Char): Int {
        return when (c) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}