//<p>Write a function that reverses a string. The input string is given as an array of characters <code>s</code>.</p>
//
//<p>You must do this by modifying the input array <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> with <code>O(1)</code> extra memory.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//<pre><strong>Input:</strong> s = ["h","e","l","l","o"]
//<strong>Output:</strong> ["o","l","l","e","h"]
//</pre><p><strong>Example 2:</strong></p>
//<pre><strong>Input:</strong> s = ["H","a","n","n","a","h"]
//<strong>Output:</strong> ["h","a","n","n","a","H"]
//</pre>
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
//	<li><code>s[i]</code> is a <a href="https://en.wikipedia.org/wiki/ASCII#Printable_characters" target="_blank">printable ascii character</a>.</li>
//</ul>
//<div><div>Related Topics</div><div><li>Two Pointers</li><li>String</li><li>Recursion</li></div></div><br><div><li>👍 5073</li><li>👎 945</li></div>

//leetcode submit region begin(Prohibit modification and deletion)
class ReverseStringWithRecursion {
    fun reverseString(s: CharArray): Unit {
        reverseRecursion(s,0,s.size-1,s.size/2)
        s.forEach { println(it) }
    }

    private fun reverseRecursion(s: CharArray,lIndex:Int,rIndex:Int,halfIndex:Int) {
        if(lIndex>halfIndex) return
        if(lIndex < halfIndex){
            var temp = s[lIndex]
            s[lIndex] = s[rIndex]
            s[rIndex] = temp
        }
        reverseRecursion(s,lIndex+1,rIndex-1,halfIndex)

    }
}
//leetcode submit region end(Prohibit modification and deletion)
