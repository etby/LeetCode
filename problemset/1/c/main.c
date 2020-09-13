#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int *result = NULL;
    *returnSize = 0;

    for (int i = 0; i < numsSize; ++i)
    {
        for (int j = i + 1; j < numsSize; ++j)
        {
            if (nums[i] + nums[j] == target)
            {
                *returnSize = 2;
                result = (int*)malloc(sizeof(int) * *returnSize);
                result[0] = i;
                result[1] = j;
                return result;
            }
        }
    }
    return result;
}