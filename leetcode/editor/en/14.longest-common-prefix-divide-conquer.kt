//leetcode submit region begin(Prohibit modification and deletion)
//Time O(S) Space O(mlogn)
//m is length of string n is size of array
//S is all characters in string O(m*n)
import java.lang.Integer.min
class LongestCommonPrefixWithDivideAndConquer {
    private fun divideAndConquerCommonPrefix(strs:Array<String>,st:Int,end:Int):String{
        if(st == end) return strs[st]
        else {
            val mid = (st+end)/2
            val stLeftCommon = divideAndConquerCommonPrefix(strs,st,mid)
            val stRightCommon = divideAndConquerCommonPrefix(strs,mid+1,end)
            return commonPrefix(stLeftCommon,stRightCommon)
        }
    }

    private fun commonPrefix(stLeftCommon: String, stRightCommon: String): String {
        var j = min(stRightCommon.length,stLeftCommon.length)
        var i = 0
        while(i<j){
            if(stLeftCommon[i] != stRightCommon[i]) return stLeftCommon.substring(0,i)
            i += 1
        }
        return stLeftCommon.substring(0,i)
    }
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs == null || strs.isEmpty()) return ""
        return divideAndConquerCommonPrefix(strs,0,strs.size-1)
    }
}
//leetcode submit region end(Prohibit modification and deletion)
