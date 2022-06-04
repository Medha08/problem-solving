/*
 * @lc app=leetcode id=412 lang=kotlin
 *
 * [412] Fizz Buzz
 */

// @lc code=start
//O(N) time O(1) space
class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val res = mutableListOf<String>()
        for(i in 1..n){
             if(i%3 == 0 && i%5 == 0) res.add("FizzBuzz")
             else if(i%3 == 0) res.add("Fizz")
            else if(i%5 == 0) res.add("Buzz")
            else res.add(i.toString())
        }
        return res
    }

}
// @lc code=end

