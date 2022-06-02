package week2.Kotlin.problemB

class Solution2 {
    //O(N)Time O(1) Space
    fun maxProduct(nums: IntArray): Int {
        var pMin = 1
        var pMax = 1
        var gProdMax = nums[0]

        nums.forEach {
            val cMin = minOf(pMin * it, pMax * it, it)
            val cMax = maxOf(pMin * it, pMax * it, it)
            gProdMax = if (cMax > gProdMax) cMax else gProdMax
            pMin = cMin
            pMax = cMax
        }
        return gProdMax
    }
}