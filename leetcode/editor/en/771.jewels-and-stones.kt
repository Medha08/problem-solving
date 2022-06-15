/*
 * @lc app=leetcode id=771 lang=kotlin
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class JewelsStones {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jMap = mutableMapOf<Char,Int>()
        var jCnt = 0
        jewels.forEach{ it ->
            jMap[it] = 1
        }
        stones.forEach{ it ->
            if(jMap.containsKey(it)) jCnt += 1
        }
        return jCnt
    }
}
// @lc code=end

