#include <stdbool.h>
#include <stdlib.h>

struct ListNode {
    int val;
    struct ListNode *next;
};

bool hasCycle(struct ListNode *head)
{
    if (!head || !head->next)
        return false;

    struct ListNode *fast = head->next;
    struct ListNode *slow = head;

    while (fast && slow)
    {
        if (fast == slow)
            break;
        fast = fast->next ? fast->next->next : fast->next;
        slow = slow->next;
    }

    return fast == slow;
}