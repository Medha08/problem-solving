package week3.Kotlin.problemB

//O(N) time O(1) space
class MaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray,k:Int): Int {
        var cnt = 0
        var zCnt = k
        var gCnt = 0
        nums.forEachIndexed { index,it ->
            if(it == 1){
                cnt += 1
            }else if(it ==0 && zCnt>0){
                cnt += 1
                zCnt -= 1
            }else if(it == 0){
               gCnt = if(gCnt > cnt) gCnt else cnt
                zCnt = k
                cnt = 0
            }
        }
        gCnt = if(gCnt > cnt) gCnt else cnt
        return gCnt
    }
}

fun main(){
    val m = MaxConsecutiveOnes()
    println(m.findMaxConsecutiveOnes(intArrayOf(1,1,0,1,1),2))
}