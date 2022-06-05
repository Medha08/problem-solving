
//leetcode submit region begin(Prohibit modification and deletion)
class MaximumWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var s = 0
        accounts.forEach{
            val lSum = it.sum()
            s = if(s>lSum) s else lSum
        }
        return s
    }
}
//leetcode submit region end(Prohibit modification and deletion)
