/*
 * @lc app=leetcode id=2181 lang=kotlin
 *
 * [2181] Merge Nodes in Between Zeros
 */

// @lc code=start
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class MergeNodesInBetweenZeroes {
    fun mergeNodes(head: ListNode?): ListNode? {
        val temp = head 
        var headl = head
        var headr = head?.next
        var sum = 0
        while(headr != null){
            if(headr.`val` != 0){
               sum += headr.`val`
               headr = headr.next 
            }else{
                val newNode = ListNode(sum)
                headl?.next = newNode
                headl = newNode
                headr = headr?.next
                sum = 0
            }
 
        }
        return temp?.next
    }
}
// @lc code=end

