package org.etby.leetcode.easy._771

class Solution {
    fun numJewelsInStones(J: String, S: String): Int {
        return S.filter { it in J }.count()
    }
}