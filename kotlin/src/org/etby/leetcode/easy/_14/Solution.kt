package org.etby.leetcode.easy._14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        var p = 0

        try {
            while (true) {
                val st = strs[0][p]
                strs.map {
                    if (it[p] != st) {
                        throw RuntimeException()
                    }
                }

                result += st
                p++
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return result
    }
}