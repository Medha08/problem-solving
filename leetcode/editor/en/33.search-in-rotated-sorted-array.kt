package leetcode.editor.en/*
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
        println("- $m,$l,$r -")
        if(arr[m] == target) return m
        else if (arr[m]>=arr[l] && arr[m]>arr[r]){
            if(arr[m]>target) l = m+1
            else r = m-1
        }
        else if (arr[m]<arr[l] && arr[m]<=arr[r]){
            if(arr[m]>target) r = m-1
            else l = m+1
            println("$l,$r")
        }
    }
    return -1
}

class SearchInRotated1 {
    fun search(nums: IntArray, target: Int): Int {
       
        if(nums.first()<nums.last()){
            return binSearch(nums,target)
        }else{
            return rotSearch(nums,target)
        }

    }
}
// @lc code=end

