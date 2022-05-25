package p2

import java.io.File
import java.io.InputStream
class SearchInRotatedArray {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size-1
        while(l<=r){
            var m = (l+r)/2
            if(nums[m] == target) return m
            else if (nums[m]>=nums[l]){
                if(target>=nums[l] && target <nums[m]) r = m-1
                else l = m+1
            }
            else if(nums[m]<=nums[r]){
                if(target<=nums[r] && target>nums[m]) l = m+1
                else r = m-1

            }
        }
        return -1
    }
}

fun main(){
    val s = SearchInRotatedArray()
    val arr = intArrayOf(4,5,6,7,8,1,2,3)
    val queries = intArrayOf(5,6,4,3,2)
    queries.forEach {
        println("${it} found at index ${s.search(arr,it)}")
    }

}