package org.etby.leetcode.easy._104

import org.etby.leetcode.easy.tree.binary.TreeNode


/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        if (root.left == null && root.right == null) {
            return 1
        }

        val leftCnt = maxDepth(root.left)
        val rightCnt = maxDepth(root.right)

        return if (leftCnt > rightCnt) {
            leftCnt + 1
        } else {
            rightCnt + 1
        }
    }
}