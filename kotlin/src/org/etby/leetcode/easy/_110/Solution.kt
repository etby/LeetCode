package org.etby.leetcode.easy._110

import org.etby.leetcode.common.binary.TreeNode

/**
 * Definition for a binary common node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {

    private val max = { l: Int, r: Int -> if (l > r) l else r }
    private val abs = { i: Int -> if (i < 0) -i else i }

    fun isBalanced(root: TreeNode?): Boolean {
        return check(root) != -1
    }

    fun check(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val lch = check(root.left)
        val rch = check(root.right)

        if (lch == -1 || rch == -1 || abs(lch - rch) > 1) {
            return -1
        }

        return max(lch, rch) + 1
    }
}