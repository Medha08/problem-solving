/*
 * @lc app=leetcode id=217 lang=kotlin
 *
 * [217] Contains Duplicate
 */

// @lc code=start
//O(N) time O(N) space
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hMap = mutableMapOf<Int,Int>()
        nums.forEach {
            if(hMap.containsKey(it))
                return false
            else
                hMap[it] = 1
        }
        return true
    }

    fun containsDuplicate2(nums:IntArray):Boolean{
       return nums.size > nums.toSet().size
    }

}
// @lc code=end

