/*
 * @lc app=leetcode id=28 lang=kotlin
 *
 * [28] Implement strStr()
 */

// @lc code=start
//O(m*n) time O(1) space
class ImplementstrStr {
    fun strStr(haystack: String, needle: String): Int {
        if(needle == "" || (haystack == "" && haystack == needle)) return 0
        else if(haystack == "") return -1
        
        var i = 0
        var nLen = needle.length
        var hLen = haystack.length
        
        while((i+nLen) <= hLen){
            if(needle[0] == haystack[i] && haystack.substring(i,i+nLen) == needle) return i
            i+= 1
        }
        return -1
    }
}
// @lc code=end

