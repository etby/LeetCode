package org.etby.leetcode.easy._122

class Solution {
    fun maxProfit(prices: IntArray?): Int {
        if (prices == null || prices.isEmpty()) {
            return 0
        }

        var interest = 0
        var inPrice = prices[0]
        var lastValue = 0
        var index = 1

        while (index < prices.size) {
            var value = prices[index] - inPrice

            if (value >= lastValue) {
                //赚
                lastValue = value
            } else {
                // 赔钱 清仓
                if (lastValue > 0) {
                    interest += lastValue
                }

                inPrice = prices[index]
                lastValue = 0
            }

            index++
        }

        if (lastValue > 0) {
            interest += lastValue
        }

        return interest
    }
}