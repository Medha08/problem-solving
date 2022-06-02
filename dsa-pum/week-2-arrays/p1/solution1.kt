package week2.Kotlin.problemA;

import java.lang.Integer.max
//O(N) Time and O(1) Space
//Kadane's Algorithm
class Solution1 {
    fun maxSubArray(nums: IntArray): Int {

        var localSum = 0
        var globalSum = nums[0]

        nums.forEach{
            localSum += it
            if(localSum >globalSum){
                globalSum = max(globalSum,localSum)
            }
            if(localSum < 0){
                localSum = 0
            }
        }
        return globalSum
    }
}
