/*
 * @lc app=leetcode id=2006 lang=kotlin
 *
 * [2006] Count Number of Pairs With Absolute Difference K
 */

// @lc code=start
//O(n^2) time O(1) space
class CountNumberOfPairsWithAbsDiff {
    fun countKDifference(nums: IntArray, k: Int): Int {
        var cnt = 0
        var i = 0
        for( i in 0 until nums.size){
            for(j in i+1 until nums.size){
                if(Math.abs(nums[j]-nums[i]) == k) {
                    cnt += 1
                }
            }
        }
        return cnt
    }
}
// @lc code=end

