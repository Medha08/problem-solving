/*
 * @lc app=leetcode id=304 lang=kotlin
 *
 * [304] Range Sum Query 2D - Immutable
 */

// @lc code=start
//O(n*n) time O(1) space
class NumMatrix(matrix: Array<IntArray>) {
    private var matrixCopy = matrix.copyOf()

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var sum = 0
        for( i in row1..row2){
            for (j in col1..col2){
                sum += matrixCopy[i][j]
            }
        }
        return sum
    }

}

fun main(){
    val r1 = intArrayOf(1,2,3,4)
    val r2 = intArrayOf(3,2,5,4)
    val matrix = arrayOf(r1,r2)
     var obj = NumMatrix(matrix)
     var param_1 = obj.sumRegion(1,2,2,1)
}
/**
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */
// @lc code=end

