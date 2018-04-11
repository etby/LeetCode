package org.etby.leetcode.easy._38

class Solution {

    var data: List<Int> = listOf(1)

    fun countAndSay(n: Int): String {
        for (i in 1 until n) {
            val spiltList = spiltList(data)
            data = spiltList.flatMap { it.toList() }
        }
        return data.joinToString(separator = "")
    }

    fun spiltList(list: List<Int>): List<Pair<Int, Int>> {
        var result: MutableList<Pair<Int, Int>> = mutableListOf()

        var cur = 0
        var cnt = 0
        for (i in list) {
            if (i == cur) {
                cnt++
                continue
            } else {
                if (cnt != 0) {
                    result.add(Pair(cnt, cur))
                }

                cnt = 1
                cur = i
            }
        }

        if (cnt != 0) {
            result.add(Pair(cnt, cur))
        }

        return result
    }
}