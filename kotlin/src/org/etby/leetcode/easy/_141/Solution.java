package src.org.etby.leetcode.medium._141;

import src.org.etby.leetcode.common.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode oneStep = head;
        ListNode twoStep = head.next;

        while (oneStep != null && twoStep != null) {
            if (oneStep.val == twoStep.val) {
                return true;
            }

            oneStep = move(1, oneStep);
            twoStep = move(2, twoStep);
        }

        return false;
    }

    public ListNode move(int step, ListNode node) {
        ListNode result = node;

        for (int i = 0; i < step; i++) {
            if (result != null) {
                result = result.next;
            }
        }

        return result;
    }
}