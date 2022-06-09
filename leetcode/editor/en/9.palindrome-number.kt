/*
 * @lc app=leetcode id=9 lang=kotlin
 *
 * [9] Palindrome Number
 */

// @lc code=start
//O(N) for toString()
//O(N) time O(1) time O(N) space
class IsPalindrome {
    fun isPalindrome(x: Int): Boolean {
        if(x<0) return false
        var numToStr = x.toString()
        var i = 0
        var j = numToStr.length-1
        while(i<j){
            if(numToStr[i] != numToStr[j]) return false
            i += 1
            j -= 1
        }
        return true 
    }
//O(N) T O(1) S
    fun isPalindrome2(x: Int): Boolean {
        if(x<0) return false
        var numToStr = Math.abs(x)
        var result = 0
        while(numToStr>0){
            var x = numToStr%10
            result = result*10 + x
            numToStr /= 10
        }
        return x == result
    }
    //fun isPalindrome(x: Int) = x.toString() == x.toString().reversed()
}

fun main(){
    println(IsPalindrome().isPalindrome(10))
}
// @lc code=end

