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


//  Example:
//  var li = ListNode(5)
//  var v = li.`val`
//  Definition for singly-linked list.
//  class ListNode(var `val`: Int) {
//      var next: ListNode? = null
//  }

fun reverse(node:ListNode?):Pair<ListNode?,ListNode?>{
    if (node?.next == null){
        return Pair(node,node)
    }
    val (prev,newHead) = reverse(node.next)
    prev?.next = node
    node.next = null
    return Pair(node,newHead)

}

class ReverseLinkedListRecursive {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null
        return reverse(head).second
    }
}
// @lc code=end

