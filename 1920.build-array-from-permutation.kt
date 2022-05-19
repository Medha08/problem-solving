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
      for(i in 0 until nums.size){
          temp = nums[nums[i]]
           nums[nums[i]] = nums[i]
           nums[i] = temp
           print(i)
      }
      return nums
   }
}

// @lc code=end

 