package org.etby.leetcode.easy._2


class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null
}


class Solution {
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
        val head = ListNode(0)

        var p1: ListNode? = l1
        var p2: ListNode? = l2

        var plusOne = false

        while (true) {
            // 退出条件
            if (p1 == null && p2 == null) {
                break
            }

            // 计算
            val ext = if (plusOne) 1 else 0
            var sum = (p1?.`val` ?: 0) + (p2?.`val` ?: 0) + ext
            val num = sum % 10
            plusOne = sum >= 10

            // 添加
            addNum(head, num)

            // 移动
            p1 = p1?.next
            p2 = p2?.next
        }

        if (plusOne) {
            addNum(head, 1)
        }

        return head.next ?: ListNode(0);
    }

    fun addNum(l: ListNode, i: Int) {
        var p = l
        while (p.next != null) {
            p = p.next!!
        }

        p.next = ListNode(i)
    }
}