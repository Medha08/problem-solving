/*
 * @lc app=leetcode id=1480 lang=kotlin
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class RunningSum {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        for(i in 1 until nums.size)
        {
            nums[i] += nums[i-1]
        }
        return nums
    }
}
// @lc code=end

