/*
 * @lc app=leetcode id=724 lang=kotlin
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class PivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var s = mutableListOf<Int>()
        s.add(nums[0])
        for (i in 1 until nums.size) {
            s.add(s[i - 1] + nums[i])
        }
        var sum = s[nums.size - 1]

        for (i in 1 until nums.size) {
            var le = s[i - 1]
            var ri = sum - (nums[i] + s[i - 1])
            println("$le $ri")
            if (le == ri) {
                return i
            }
        }
        return -1

    }
}

fun main(){
    val s = PivotIndex()
    val nums = intArrayOf(2,1,-1)
    println(s.pivotIndex(nums))
}
// @lc code=end

