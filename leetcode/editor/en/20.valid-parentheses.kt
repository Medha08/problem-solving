/*
 * @lc app=leetcode id=20 lang=kotlin
 *
 * [20] Valid Parentheses
 */

// @lc code=start
//O(N) time O(N) space
class ValidParentheses {
    fun isValid(s: String): Boolean {
        val hmap = mapOf(')' to '(','}' to '{',']' to '[')
        val hset = setOf<Char>('[','{','(')
        val stack = mutableListOf<Char>()

        s.forEach{
            if(hset.contains(it)){
                stack.add(it)
            }else{
                println(stack)
                if(stack.size == 0) return false
                val top = stack.last()
                val combinationOfEle = hmap[it]
                if(top != combinationOfEle) return false
                else stack.removeAt(stack.size-1)
            }
        }
        if(stack.size>0) return false
        return true
    }
}

fun main(){
    val s = ValidParentheses()
    println(s.isValid("[][]["))
    println(s.isValid("]][]["))
    println(s.isValid("["))
    println(s.isValid("[]"))
    println(s.isValid("(]"))
    println(s.isValid("()[]{}"))
    println(s.isValid("[([]])"))

}
// @lc code=end

