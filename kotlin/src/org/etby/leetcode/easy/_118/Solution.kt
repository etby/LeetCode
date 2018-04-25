package org.etby.leetcode.easy._118

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        var result: MutableList<List<Int>> = mutableListOf()
        for (i in 1..numRows) {
            when (i) {
                1 -> result.add(listOf(1))
                2 -> result.add(listOf(1, 1))
                else -> result.add(nextLine(result[i - 2]))
            }
        }
        return result
    }

    fun nextLine(list: List<Int>): List<Int> {
        var result: MutableList<Int> = mutableListOf()
        result.add(1)
        for (i in 0 until list.size - 1) {
            result.add(list[i] + list[i + 1])
        }
        result.add(1)
        return result
    }
}