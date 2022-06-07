/*
 * @lc app=leetcode id=160 lang=kotlin
 *
 * [160] Intersection of Two Linked Lists
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

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
//O(2(M+N)) O(1)
class IntersectionOfTwoLinkedLists2 {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var currA = headA
        var currB = headB
        while(currA!=currB){
            currA = if(currA == null) headB else currA.next
            currB = if(currB == null) headA else currB.next
        }
        return currA
    }
}
// @lc code=end

