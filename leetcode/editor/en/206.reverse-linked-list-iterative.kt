/*
 * @lc app=leetcode id=206 lang=kotlin
 *
 * [206] Reverse Linked List
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
class ReverseListIterative {
    fun reverseList(head: ListNode?): ListNode? {
        var newHead:ListNode? = head
        var prev: ListNode? = null
        var temp: ListNode? 
        while(newHead!=null){
            temp = newHead.next
            newHead.next = prev
            prev = newHead 
            newHead = temp
        }
        return prev
        
    }
}
// @lc code=end

