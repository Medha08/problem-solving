/*
 * @lc app=leetcode id=1470 lang=kotlin
 *
 * [1470] Shuffle the Array
 */

// @lc code=start
//O(N) time O(N) space result array
class ShuffleArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        var e = n
        var s = 0
        var lst = mutableListOf<Int>()
        while(e<nums.size){
            lst.add(nums[s])
            lst.add(nums[e])
            s += 1
            e += 1
        }
        return lst.toIntArray()

    }
}
// @lc code=end

