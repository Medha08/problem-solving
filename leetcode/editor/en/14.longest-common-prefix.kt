
//leetcode submit region begin(Prohibit modification and deletion)
//Time O(n) * O(min(str1,str2)) Space O(1)
class LongestCommonPrefix {
    private fun findCommon(str:String, common:String):String{
        var res = ""
        var i = 0
        while(i<str.length && i<common.length){
            if(str[i] != common[i]) break
            else res += str[i]
            i += 1
        }
        return res
    }
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.size == 1) return strs[0]
        var common = strs[0]
        for(i in 1 until strs.size){
            if(strs[i] == "" || common == "") return ""
            else {
                common = findCommon(strs[i],common)
            }
        }
        return common
    }
}
//leetcode submit region end(Prohibit modification and deletion)
