/*
 * @lc app=leetcode id=66 lang=kotlin
 *
 * [66] Plus One
 */

// @lc code=start
//O(N) time and O(N) space
class PlusOne {
    fun plusOne(digits: IntArray):IntArray{
        var res = mutableListOf<Int>()
        var lastIndex = digits.size-1
        if(digits[lastIndex]<9){
            digits.forEachIndexed{ index,it ->
                if(index == lastIndex) res.add(it+1)
                else res.add(it)
            }
            return res.toIntArray()
        }else {
            while(lastIndex>=0 && digits[lastIndex] == 9 ){
                res.add(0)
                lastIndex -= 1
            }
            if(lastIndex >= 0){
                res.add(digits[lastIndex]+1)
                println("$res ---- $lastIndex")
                lastIndex -= 1
                while(lastIndex >= 0){
                    res.add(digits[lastIndex])
                    lastIndex -= 1
                }
            }else {
                res.add(1)
            }

            return res.reversed().toIntArray()
        }

    }
}

fun main(){
    val s = PlusOne()
    println(s.plusOne(intArrayOf(9,9,9)))
}
// @lc code=end
