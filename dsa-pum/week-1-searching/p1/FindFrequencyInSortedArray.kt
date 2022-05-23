package p1

import java.io.File
import java.io.InputStream


class Utility{
    fun findLeftMostIndex(arr:IntArray,target:Int):Int{
        var l = 0
        var r = arr.size-1
        while(l<=r){
            var m = (l+r)/2
            if(arr[m] == target && m-1>=0 && arr[m-1]<arr[m]){
                return m
            }
            else if (arr[m] == target &&  m-1>=0 && arr[m-1] == arr[m]){
                r = m-1
            }
            else if (target >arr[m]){
                l = m+1
            }
            else if(target<arr[m]){
                r = m-1
            }
            else if ( arr[m] == target && m-1 < 0){
                return 0
            }
        }
        return -1

    }
    fun findRightMostIndex(arr:IntArray,target:Int):Int{
        var l = 0
        var r = arr.size-1
        var len = arr.size
        while(l<=r){
            var m = (l+r)/2
            if(arr[m] == target && m+1<len && arr[m+1]>arr[m]){
                return m
            }
            else if (arr[m] == target &&  m+1<len && arr[m+1] == arr[m]){
                l = m+1
            }
            else if (target >arr[m]){
                l = m+1
            }
            else if(target<arr[m]){
                r = m-1
            }
            else if ( arr[m] == target && m+1 == len){
                return len-1
            }
        }
        return -1
    }
}


class FindFrequencyInSortedArray{
    fun findFreq(arr:IntArray):MutableMap<Int,Int>{
        var hMap = mutableMapOf<Int,Int>()
        val u = Utility()
        arr.forEach { 
            //println (u.findLeftMostIndex(arr,it))
            hMap[it] = (u.findRightMostIndex(arr,it)-u.findLeftMostIndex(arr,it))+1
         }
        return hMap 
    }
}

fun main(){
    val inputStream_in: InputStream = File("p1/in1.txttxt").inputStream()
    val inputList = mutableListOf<Int>()
    inputStream_in.bufferedReader().forEachLine { inputList.add(it.toInt()) }
    println(inputList)
    val arr = inputList.slice(1 until inputList.size).toIntArray()
    val s = FindFrequencyInSortedArray()
    val hMap= s.findFreq(arr)


    var outputFile = File("p1/out.txttxt")
    if (outputFile.exists()) outputFile.delete()

    hMap.forEach {
        outputFile.appendText("${it.key} occurs ${it.value} times \n")
     }

}