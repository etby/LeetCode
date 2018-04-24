package org.etby.leetcode.easy._107

import org.etby.leetcode.easy.tree.binary.TreeNode
import java.util.*

/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {

    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        var result: MutableList<List<Int>> = mutableListOf()

        if (root == null) {
            return result.toList()
        }

        var rootList: List<TreeNode> = listOf(root)

        while (rootList.isNotEmpty()) {
            result.add(0, getNodeValues(rootList))
            rootList = getChildList(rootList)
        }

        return result.toList()
    }

    private fun getNodeValues(list: List<TreeNode>): List<Int> {
        return list.map { it.`val` }
    }

    private fun getChildList(list: List<TreeNode>): List<TreeNode> {
        val result: MutableList<TreeNode> = mutableListOf()
        list.forEach {
            it.left?.let { result.add(it) }
            it.right?.let { result.add(it) }
        }
        return result
    }

}