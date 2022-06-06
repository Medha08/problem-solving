/*
 * @lc app=leetcode id=485 lang=kotlin
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
//O(N) time O(1) space
class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var sum = 0
        var lsum = 0
        nums.forEach{
            if(it == 0){
                lsum = 0
            }
            else {
                lsum += it
            }
            sum = if(lsum>sum) lsum else sum
        }
        return sum
    }
}
// @lc code=end

