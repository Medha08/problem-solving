/*
 * @lc app=leetcode id=33 lang=kotlin
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
fun binSearch(arr:IntArray,target:Int):Int{
    var l = 0
    var r = arr.size-1
 while(l<=r){
     var m = (l+r)/2
     if(arr[m] == target) return m
     else if (target < arr[m]) r = m-1
     else l = m+1
 }
 return -1
}
fun rotSearch(arr:IntArray,target:Int):Int{
    var l = 0
    var r = arr.size-1
    while(l<=r){
        var m = (l+r)/2
        print("$m,$l,$r")
        if(arr[m] == target) return m
        else if(target < arr[m] && target >= arr[l]) r = m-1
        else if (target < arr[m] && target <= arr[r]) l= m+1
        else if(target > arr[m] && target <= arr[r]) l = m+1
        else if (target > arr[m] && target >= arr[l]) r= m-1
    }
    return -1
}

class Solution {
    fun search(nums: IntArray, target: Int): Int {
       
        if(nums.first()<nums.last()){
            return binSearch(nums,target)
        }else{
            return rotSearch(nums,target)
        }

    }
}
// @lc code=end

