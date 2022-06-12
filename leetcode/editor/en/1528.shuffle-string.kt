/*
 * @lc app=leetcode id=1528 lang=kotlin
 *
 * [1528] Shuffle String
 */

// @lc code=start
class ShuffleString {
    fun restoreString(s: String, indices: IntArray): String {
        val sMutable = MutableList(indices.size){ 'a'}
        indices.forEachIndexed { index, it ->
            sMutable[it] = s[index]
        }
        return sMutable.joinToString("")

    }
}
// @lc code=end

