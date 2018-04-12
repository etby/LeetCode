package org.etby.leetcode.easy._70

class Solution {

    fun climbStairs(n: Int): Int {
        return loop(n)
    }

    fun recursive(n: Int): Int {
        if (n <= 1) {
            return 1
        }

        return recursive(n - 1) + recursive(n - 2)
    }

    fun loop(n: Int): Int {
        val cache = IntArray(n + 1)
        var p = 2
        cache[0] = 1
        cache[1] = 1

        while (p <= n) {
            cache[p] = cache[p - 1] + cache[p - 2]
            p++
        }

        return cache[n]
    }

}