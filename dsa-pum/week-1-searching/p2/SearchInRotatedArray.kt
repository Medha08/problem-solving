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
    var left = 0
    var right = arr.size-1
    var l = 0
    var r = arr.size-1
    while(l<=r){
        var m = (l+r)/2
        if(arr[m] == target) return m
        else if (arr[m]>=arr[left] && arr[m]>=arr[right]){

            if(arr[m]>target) l = m+1
            else r = m-1
        }
        else if (arr[m]<= arr[left] && arr[m]<=arr[right]){
            println("hhh")
            if(arr[m]>target) r = m-1
            else l = m+1
        }
        else {
            return -1
        }
    }
    return -1
}

class SearchInRotatedArray {
    fun search(nums: IntArray, target: Int): Int {

        if(nums.first()<nums.last()){
            return leetcode.editor.en.binSearch(nums, target)
        }else{
            return leetcode.editor.en.rotSearch(nums, target)
        }

    }
}

fun main(){
    val s = SearchInRotatedArray()
    val arr = intArrayOf(4,5,6,7,8,1,2,3)
    val target = 4
    println("sol is ${s.search(arr,target)}")
}