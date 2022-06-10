package week3.Kotlin.problemA
//O(N) time and O(N) space
class CountDistinctInWindow {

    fun countDistinct(nums:IntArray,n:Int,k:Int):List<Int>{
        val hmap = mutableMapOf<Int,Int>()
        val result = mutableListOf<Int>()
        var cnt = 0
        for(i in 0 until k){
            if(hmap.containsKey(nums[i])){
                hmap[nums[i]] = hmap[nums[i]]!! + 1
            }else{
                hmap[nums[i]] = 1
                cnt +=1
            }
        }
        result.add(cnt)

        var s = 0
        var e = k
        while(e<n){
            if(hmap.containsKey(nums[e]) && hmap[nums[e]]!!>0){
                hmap[nums[e]] = hmap[nums[e]]!! + 1
            }else{
                hmap[nums[e]] = 1
                cnt += 1
            }

            if(hmap[nums[s]] == 1){
                cnt -=  1
                hmap[nums[s]] = 0
            }else {
                hmap[nums[s]] = hmap[nums[s]]!! - 1
            }

            result.add(cnt)
            e += 1
            s += 1

        }
        return result
    }
}

fun main(){
    val nums = intArrayOf(1, 2, 1, 3 ,4 ,2, 3)
    val n = 7
    val k = 4
    val c = CountDistinctInWindow()
    println(c.countDistinct(nums,n,k))
    val nums2 = intArrayOf(1, 1, 2, 1, 3)
    val n2 = 5
    val k2 = 3
    val c2 = CountDistinctInWindow()
    println(c2.countDistinct(nums2,n2,k2))
}