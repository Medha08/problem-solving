/*
 * @lc app=leetcode id=2095 lang=kotlin
 *
 * [2095] Delete the Middle Node of a Linked List
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
class DeleteMiddleOfLinkedList {
    fun deleteMiddle(head: ListNode?): ListNode? {
        if(head?.next == null) return null
        var slow = head 
        var fast = head 
        var prev = head 
        while(fast!= null && fast.next != null){
            prev = slow 
            slow = slow?.next
            fast = fast.next?.next
        }
        prev?.next = slow?.next
        return head 
    }
}
// @lc code=end

