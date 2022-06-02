/*
 * @lc app=leetcode id=242 lang=kotlin
 *
 * [242] Valid Anagram
 */

// @lc code=start
//O(N) time O(N) space
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        val hMap = mutableMapOf<Char,Int>()
        s.forEach{
            if(hMap.containsKey(it)){
                hMap[it] = hMap[it]!! - 1
            }else{
                hMap[it] = 1
            }
        }

        t.forEach{
            if(hMap.containsKey(it)){
                if(hMap[it]!!>0){
                    hMap[it] = hMap[it]!! - 1
                }else {
                    return false
                }
            }else return false
        }

        hMap.forEach{ (_, value) ->
            if(value >0) return  false
        }

        return true
    }

    fun isAnagramGood(s: String, t: String): Boolean {
        val dict = IntArray(26).apply {
            s.forEach { ch ->
                this[ch.toIndex()]++
            }
        }
        t.forEach { ch ->
            when(val count = dict[ch.toIndex()]) {
                0 -> return false
                else -> dict[ch.toIndex()]--
            }
        }
        return dict.allZeroes()
    }

    private fun Char.toIndex() = this - 'a'

    private fun IntArray.allZeroes() = all { it == 0 }
}

// @lc code=end

