/*
 * @lc app=leetcode id=136 lang=kotlin
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    fun singleNumber(nums: IntArray): Int {
        var res = 0
        nums.forEach {
            res = it xor res 
        }
        return res
    }
}
// @lc code=end

