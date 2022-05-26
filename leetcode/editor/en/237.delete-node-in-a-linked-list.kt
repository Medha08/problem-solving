/*
 * @lc app=leetcode id=237 lang=kotlin
 *
 * [237] Delete Node in a Linked List
 */

// @lc code=start
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 *  */
  class ListNode(var `val`: Int) {
      var next: ListNode? = null
  }


class DeleteNodeInLL {
    fun deleteNode(node: ListNode?) {
        if(node == null) return
        node.`val` = node.next!!.`val`
        node.next = node.next?.next 
    }
}
// @lc code=end

