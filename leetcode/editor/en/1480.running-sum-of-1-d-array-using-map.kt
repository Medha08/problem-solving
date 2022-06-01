/*
 * @lc app=leetcode id=1480 lang=kotlin
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class RunningSumOfArrayUsingMap {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        val newNums = nums.map{
            sum = sum + it
            sum
        }
        return newNums.toIntArray()
    }
}
// @lc code=end

