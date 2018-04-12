package org.etby.leetcode.easy._88

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n == 0) {
            return
        }

        System.arraycopy(nums2, 0, nums1, m, n)
        nums1.sort()
    }

    fun mergeError(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var insertPoint = 0
        var readPoint = 0

        while (readPoint < n) {
            while (insertPoint < m + readPoint && nums1[insertPoint] <= nums2[readPoint]) {
                insertPoint++
            }

            insert(nums1, insertPoint, nums2[readPoint])
            readPoint++
        }
    }

    private fun insert(nums: IntArray, index: Int, i: Int) {
        var needInsert = i
        for (i in index..nums.size - index) {
            val tmp = nums[i]
            nums[i] = needInsert
            needInsert = tmp
        }
    }
}