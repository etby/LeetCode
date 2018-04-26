package org.etby.leetcode.easy._108

import org.etby.leetcode.common.binary.TreeNode

/**
 * Definition for a binary common node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) {
            return null
        }
        val center = nums.size / 2

        val result = TreeNode(nums[center])

        result.left = sortedArrayToBST(nums.sliceArray(IntRange(0, center - 1)))
        result.right = sortedArrayToBST(nums.sliceArray(IntRange(center + 1, nums.size - 1)))

        return result
    }
}