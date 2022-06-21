/*
 * @lc app=leetcode id=1108 lang=kotlin
 *
 * [1108] Defanging an IP Address
 */

// @lc code=start
class DefanglingAddress {
    fun defangIPaddr(address: String): String {
        return address.replace(".","[.]")
    }
}
// @lc code=end

