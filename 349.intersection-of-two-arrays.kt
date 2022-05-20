/*
 * @lc app=leetcode id=349 lang=kotlin
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
fun binSearch(num:Int,arr:IntArray):Boolean{
    var l = 0
    var r = arr.size-1

    while(l<=r){
       var m = (l+r)/2
        if(arr[m] == num) return true
        else if(arr[m] < num) l = m+1
        else r = m-1
    }
    return false

}

class IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        var res = mutableSetOf<Int>()
        if(nums1.size<nums2.size){
            nums2.sort()
           
            nums1.forEach{ it ->
                if (binSearch(it,nums2)) {
                    res.add(it)
                }
              
            }
        }else{
            nums1.sort()
           
            nums2.forEach{ it ->
                if(binSearch(it,nums1)){
                    res.add(it)
                }
            }
        }
        return res.toIntArray()
    }
}
// @lc code=end

