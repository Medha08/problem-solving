/*
 * @lc app=leetcode id=27 lang=kotlin
 *
 * [27] Remove Element
 */

// @lc code=start
class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        var n = nums.size
        while (i < n) {
            if (nums[i] == `val`) {
                nums[i] = nums[n - 1]
                n -= 1
            } else i++
        }
        return n
    }


}
// @lc code=end

