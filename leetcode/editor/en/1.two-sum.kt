/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 */

// @lc code=start
//O(N) time O(N) space
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var hMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, it ->
            val diff = target - it
            if (hMap.containsKey(diff) && index != hMap[diff])
                return intArrayOf(index, hMap[diff]!!)
            else
                hMap[it] = index
        }
        return intArrayOf(0, 0)
    }
}
// @lc code=end

