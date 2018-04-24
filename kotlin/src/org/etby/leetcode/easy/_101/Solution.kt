package org.etby.leetcode.easy._101

import org.etby.leetcode.easy.tree.binary.TreeNode

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }

        return dfs(root.left, root.right)
    }

    fun dfs(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }
        if (left == null || right == null) {
            return false
        }
        if (left.`val` != right.`val`) {
            return false
        }
        if (!dfs(left.left, right.right)) {
            return false
        }
        if (!dfs(left.right, right.left)) {
            return false
        }
        return true
    }
}