package leetcode.editor.en/*
 * @lc app=leetcode id=1929 lang=kotlin
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class ConcatArray_1 {
    fun getConcatenation(nums: IntArray): IntArray {
        return nums + nums
    }
}
class ConcatArray_2 {
    fun getConcatenation(nums: IntArray): IntArray {
        return IntArray(nums.size*2) { nums[it % nums.size] }
    }
}
// @lc code=end
