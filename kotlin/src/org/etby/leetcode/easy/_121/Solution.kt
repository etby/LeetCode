package org.etby.leetcode.easy._121

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var interest = 0

        for (i in 0 until prices.size) {
            for (j in 0 until prices.size) {
                if (i >= j) {
                    continue
                }
                val value = prices[j] - prices[i]
                if (value > interest) {
                    interest = value
                }
            }
        }

        return interest
    }
}