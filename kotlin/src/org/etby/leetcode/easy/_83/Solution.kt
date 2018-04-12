package org.etby.leetcode.easy._83

/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var p = head
        while (p != null) {
            var node = p.next
            while (node != null && node.`val` == p.`val`) {
                node = node.next
            }
            p.next = node
            p = node
        }
        return head
    }
}