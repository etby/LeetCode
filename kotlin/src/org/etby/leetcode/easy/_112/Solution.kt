package org.etby.leetcode.easy._112

import org.etby.leetcode.common.binary.TreeNode

/**
 * Definition for a binary common node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        if (root == null) {
            return false
        }

        val lastSum = sum - root.`val`
        if (lastSum == 0 && root.left == null && root.right == null) {
            return true
        }

        return hasPathSum(root.left, lastSum) || hasPathSum(root.right, lastSum)
    }
}