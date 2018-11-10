package org.etby.leetcode.easy._88

class Solution {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val length = m + n
        if (n == 0 || length == 0) {
            return
        }

        var p2 = 0

        for (i in 0 until length) {
            if (p2 >= n) break //第二组没有了

            val v1 = nums1[i]
            val v2 = nums2[p2]

            // 2 小于 1
            if (v2 < v1) {
                System.arraycopy(nums1, i, nums1, i + 1, m - (i - p2))
                nums1[i] = v2
                p2++
            }

            // 1 数组没有了
            if (i >= m + p2) {
                nums1[i] = v2
                p2++
            }
        }

    }

}