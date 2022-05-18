/*
 * @lc app=leetcode id=1920 lang=kotlin
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start
// class ArrayFromZeroPermutation_1 {
//     fun buildArray(nums: IntArray): IntArray {
//         return IntArray(nums.size) { nums[nums[it]] }
//     }
// }

//--- such fine use case of map I learned ---//
class Solution {
    fun buildArray(nums: IntArray): IntArray {
        var temp = 0
        nums.forEach { 
            temp = nums[it]
            nums[it] = it
            nums.forEach { print(it) }
            -1
         }
         return nums
    }
}

// @lc code=end

