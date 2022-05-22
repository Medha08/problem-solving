/*
 * @lc app=leetcode id=344 lang=kotlin
 *
 * [344] Reverse String
 */

// @lc code=start
class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var l = 0
        var r = s.size-1
        while(l<=r){
            var temp = s[l]
            s[l] = s[r]
            s[r] = temp
            l += 1
            r -= 1
        }
    }
}
// @lc code=end

