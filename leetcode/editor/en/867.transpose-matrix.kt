class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        var res = mutableListOf<IntArray>()
        for(c in 0 until matrix[0].size){
            val resRow = mutableListOf<Int>()
            for (r in 0 until matrix.size){
                resRow.add(matrix[r][c])
            }
            res.add(resRow.toIntArray())
        }
        return res.toTypedArray()
    }
}
