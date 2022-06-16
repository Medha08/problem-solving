/*
 * @lc app=leetcode id=203 lang=kotlin
 *
 * [203] Remove Linked List Elements
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
//O(n) time O(1) space
class RemoveElements {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var temp = ListNode(-1)
        temp.next = head
        var fTemp = temp
        var head2 = head
        while(head2 != null){
            if(head2.`val` == `val`){
                temp.next = head2.next
                head2 = temp.next
            }else {
                head2 = head2.next
                temp = temp.next
            }
        }
        
        return fTemp.next
    }
}
// @lc code=end

