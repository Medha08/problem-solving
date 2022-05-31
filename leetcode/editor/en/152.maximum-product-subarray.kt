/*
 * @lc app=leetcode id=152 lang=kotlin
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
//O(N)Time O(1) Space
class MaxProductSubArray {
    fun maxProduct(nums: IntArray): Int {
        var pMin = 1
        var pMax = 1
        var gProdMax = nums[0]
        
        nums.forEach{
            val cMin = minOf(pMin*it,pMax*it,it)
            val cMax = maxOf(pMin*it,pMax*it,it)
            gProdMax = if(cMax>gProdMax) cMax else gProdMax
            pMin = cMin
            pMax = cMax
        }
        return gProdMax
    }
}
// @lc code=end
//[-3,-1,-1,4,-4]
//pMa 48
// pMi -4
// ans = 48

