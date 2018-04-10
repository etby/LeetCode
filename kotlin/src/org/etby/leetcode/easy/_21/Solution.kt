package org.etby.leetcode.easy._21

class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}

class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var head = ListNode(0)

        var p = head
        var p1: ListNode? = l1
        var p2: ListNode? = l2

        while (p1 != null || p2 != null) {
            var node = p1
            if (node == null) {
                node = p2
            } else if (p2 != null) {
                if (node.`val` > p2.`val`) {
                    node = p2
                }
            }

            node?.let {
                p.next = it
                p = it
                when (it) {
                    p1 -> p1 = it.next
                    p2 -> p2 = it.next
                }
            }
        }

        return head.next
    }

}