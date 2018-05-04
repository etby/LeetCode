#include <stdbool.h>

#include "../common/singly-linked.h"

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if (!head || !head->next)
        return false;

    struct ListNode *fast = head;
    struct ListNode *slow = head;

    do {
        fast = fast->next->next;
        slow = slow->next;
    } while (fast != NULL && fast->next != NULL && fast != slow);

    return fast == slow;
}