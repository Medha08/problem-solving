/*
 * @lc app=leetcode id=268 lang=kotlin
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    fun missingNumber(nums: IntArray): Int {
        var hMap = mutableMapOf<Int,Int>()
        nums.forEach{
            hMap[it] = 1
        }

        for(i in 0 until nums.size+1){
            if(!hMap.contains(i) )return i
        }

        return 1
    }
}
// @lc code=end

