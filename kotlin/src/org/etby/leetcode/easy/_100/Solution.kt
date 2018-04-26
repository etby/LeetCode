package org.etby.leetcode.easy._100

import org.etby.leetcode.common.binary.TreeNode

/**
 * Definition for a binary common node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        return checkEquals(p, q)
    }

    fun checkEquals(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }

        if (p != null && q != null) {
            return p.`val` == q.`val` && checkEquals(p.left, q.left) && checkEquals(p.right, q.right)
        }

        return false
    }
}