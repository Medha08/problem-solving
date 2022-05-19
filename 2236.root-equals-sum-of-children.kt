/*
 * @lc app=leetcode id=2236 lang=kotlin
 *
 * [2236] Root Equals Sum of Children
 */

// @lc code=start
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class RootSumEqualsChildren {
    fun checkTree(root: TreeNode?): Boolean {
        
        return if(root!!.`val` == (root!!.right.`val` + root!!.left.`val`)) true else false

    }
}
// @lc code=end

