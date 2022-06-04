/*
 * @lc app=leetcode id=125 lang=kotlin
 *
 * [125] Valid Palindrome
 */

// @lc code=start

class Solution {
    fun isPalindrome(s: String): Boolean {

        var result = s.filter{
            it.isLetterOrDigit()
        }.map{ it.toLowerCase() }

        return result.reversed() == s.toList()
    }
}
// @lc code=end

