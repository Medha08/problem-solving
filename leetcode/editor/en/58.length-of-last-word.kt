/*
 * @lc app=leetcode id=58 lang=kotlin
 *
 * [58] Length of Last Word
 */

// @lc code=start
// O(N) time O(1) space
class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        // return s.trim().split(" ").last().length
        if(s.isEmpty()) return 0

        var l = 0
        var i = s.length-1
        while(i>=0){
            if(s[i] == ' '){
                i -= 1
            }
            else break
        }
        while(i>=0){
            if(s[i] != ' '){
                l+= 1
            }
            else {
                return l
            }
            i -= 1
        }
        return l
    }
}

fun main() {
    val s = LengthOfLastWord()
    println(s.lengthOfLastWord("Today is a nice day"))
}
// @lc code=end

