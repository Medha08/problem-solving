
//leetcode submit region begin(Prohibit modification and deletion)
// O(n) Time O(1) Space
class FindValueOfVariableAfterPerformingOperations {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var num = 0
        operations.forEach{
            if(it == "++X" || it == "X++") num = num+1
            else num =  num-1
        }

        return num
    }
}
//leetcode submit region end(Prohibit modification and deletion)
