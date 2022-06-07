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
//O(M+N + min(M,N)) O(1) space
class IntersectionOfTwoLinkedLists {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var h1 = headA
        var cnt1 = 0
        var h2 = headB
        var cnt2 = 0
        while(h1 != null){
            cnt1 += 1
            h1 = h1.next
        }
        
         while(h2 != null){
            cnt2 += 1
            h2 = h2.next
        }
         
         var headAA = headA
         var headBB = headB
         if(cnt1>cnt2) {
             var diff = cnt1-cnt2
             while(diff != 0 && headAA!=null){
                 headAA = headAA!!.next
                 diff -= 1
             }
         }else{
              var diff = cnt2-cnt1
             while(diff != 0 && headBB!=null){
                 headBB = headBB!!.next
                 diff -=1       
             }
         }
         while(headAA != null && headBB != null){
                 if(headAA == headBB) return headAA
                 headAA = headAA.next
                 headBB = headBB.next
             }
        return null    
    }
}
// @lc code=end

