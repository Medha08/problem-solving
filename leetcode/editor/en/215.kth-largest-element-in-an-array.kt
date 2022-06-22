/*
 * @lc app=leetcode id=215 lang=kotlin
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class FindKthLargest {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        return nums.sorted().reversed()[k]
    }
}
// @lc code=end

