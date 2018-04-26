package org.etby.leetcode.easy._111

import org.etby.leetcode.common.binary.TreeNode

/**
 * Definition for a binary common node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        var min = 0
        var nodes = mutableListOf<TreeNode>()
        root.left?.let { nodes.add(it) }
        root.right?.let { nodes.add(it) }
        nodes.forEach {
            val depth = minDepth(it)
            if (depth != 0) {
                if (min == 0 || depth < min) {
                    min = depth
                }
            }
        }

        return 1 + min
    }
}