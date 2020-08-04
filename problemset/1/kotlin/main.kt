class Solution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in 0 until nums.size) {
                if (i == j) {
                    continue
                }
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf()
    }

}