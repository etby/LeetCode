package org.etby.leetcode.easy._119

class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val result: MutableList<Int> = mutableListOf()
        for (i in 0..rowIndex) {
            toNext(result)
        }
        return result
    }

    fun toNext(list: MutableList<Int>) {
        val src = list.toList()
        list.clear()

        var cur = 0
        src.forEach {
            list.add(it + cur)
            cur = it
        }
        list.add(1)
    }
}