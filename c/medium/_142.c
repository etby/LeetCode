//
// Created by Etby on 2018/5/4.
//

#include "singly-linked.h"

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    if (!head || !head->next)
        return NULL;

    struct ListNode *fast = head;
    struct ListNode *slow = head;

    do {
        fast = fast->next->next;
        slow = slow->next;
    } while (fast != NULL && fast->next != NULL && fast != slow);

    if (fast != slow) {
        return NULL;
    }

    while (head != fast) {
        head = head->next;
        fast = fast->next;
    }

    return head;
}