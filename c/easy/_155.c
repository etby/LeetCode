//
// Created by Etby on 2018/5/4.
//

#include <stdio.h>
#include <stdlib.h>
#include "singly-linked.h"

typedef struct {
    struct ListNode *head;
    struct ListNode *minHead;
} MinStack;

/** initialize your data structure here. */
MinStack *minStackCreate(int maxSize) {
    MinStack *stack = malloc(sizeof(MinStack));
    stack->head = NULL;
    stack->minHead = NULL;
    return stack;
}

void minStackPush(MinStack *obj, int x) {
    struct ListNode *node = malloc(sizeof(struct ListNode));
    node->val = x;
    node->next = NULL;

    // 添加到栈中
    if (obj->head) {
        node->next = obj->head;
    }
    obj->head = node;

    // 判断是否添加到最小栈
    if (obj->minHead == NULL || obj->minHead->val >= x) {
        struct ListNode *minNode = malloc(sizeof(struct ListNode));
        minNode->val = x;
        minNode->next = obj->minHead;
        obj->minHead = minNode;
    }
}

void minStackPop(MinStack *obj) {
    struct ListNode *node = obj->head;
    if (node) {
        // 从栈中移除
        obj->head = node->next;

        // 判断是否从最小栈移除
        if (obj->minHead && obj->minHead->val == node->val) {
            struct ListNode *minNode = obj->minHead;
            obj->minHead = minNode->next;

            free(minNode);
        }

        free(node);
    }
}

int minStackTop(MinStack *obj) {
    if (obj && obj->head) {
        return obj->head->val;
    }

    return 0;
}

int minStackGetMin(MinStack *obj) {
    if (obj && obj->minHead) {
        return obj->minHead->val;
    }

    return 0;
}

void minStackFree(MinStack *obj) {
    if (obj) {
        while (obj->head) {
            struct ListNode *node = obj->head;
            obj->head = node->next;
            free(node);
        }

        while (obj->minHead) {
            struct ListNode *node = obj->minHead;
            obj->minHead = node->next;
            free(node);
        }

        free(obj);
    }
}

int main() {
    printf("Hello, World!\n");

    MinStack *stack = minStackCreate(0);
    minStackPush(stack, 2);
    minStackPush(stack, 0);
    minStackPush(stack, 3);
    minStackPush(stack, 0);

    minStackPop(stack);
    printf("get num %d \n", minStackGetMin(stack));

    minStackPop(stack);
    printf("get num %d \n", minStackGetMin(stack));

    minStackPop(stack);
    printf("get num %d \n", minStackGetMin(stack));

    return 0;
}
/**
 * Your MinStack struct will be instantiated and called as such:
 * struct MinStack* obj = minStackCreate(maxSize);
 * minStackPush(obj, x);
 * minStackPop(obj);
 * int param_3 = minStackTop(obj);
 * int param_4 = minStackGetMin(obj);
 * minStackFree(obj);
 */