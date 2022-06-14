/*
 * @lc app=leetcode id=169 lang=kotlin
 *
 * [169] Majority Element
 */

// @lc code=start
//O(nlogn) Leetcode O(1) space
class Solution {
    fun majorityElement(nums: IntArray): Int {
        nums.sort()
        return nums[nums.size/2]
    }
}
// @lc code=end

