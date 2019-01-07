package _203;

import common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        if (head.val == val) {
            return removeElements(head.next, val);
        }

        ListNode cur = head;
        while (cur.next != null) {
            ListNode next = cur.next;

            if (next.val == val) {
                cur.next = next.next;
                continue;
            }

            cur = next;
        }

        return head;
    }
}