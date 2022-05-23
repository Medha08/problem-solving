//<p>You are given a <strong>0-indexed</strong> integer array <code>nums</code> and a target element <code>target</code>.</p>
//
//<p>A <strong>target index</strong> is an index <code>i</code> such that <code>nums[i] == target</code>.</p>
//
//<p>Return <em>a list of the target indices of</em> <code>nums</code> after<em> sorting </em><code>nums</code><em> in <strong>non-decreasing</strong> order</em>. If there are no target indices, return <em>an <strong>empty</strong> list</em>. The returned list must be sorted in <strong>increasing</strong> order.</p>
//
//<p>&nbsp;</p>
//<p><strong>Example 1:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1,2,5,2,3], target = 2
//<strong>Output:</strong> [1,2]
//<strong>Explanation:</strong> After sorting, nums is [1,<u><strong>2</strong></u>,<u><strong>2</strong></u>,3,5].
//The indices where nums[i] == 2 are 1 and 2.
//</pre>
//
//<p><strong>Example 2:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1,2,5,2,3], target = 3
//<strong>Output:</strong> [3]
//<strong>Explanation:</strong> After sorting, nums is [1,2,2,<u><strong>3</strong></u>,5].
//The index where nums[i] == 3 is 3.
//</pre>
//
//<p><strong>Example 3:</strong></p>
//
//<pre>
//<strong>Input:</strong> nums = [1,2,5,2,3], target = 5
//<strong>Output:</strong> [4]
//<strong>Explanation:</strong> After sorting, nums is [1,2,2,3,<u><strong>5</strong></u>].
//The index where nums[i] == 5 is 4.
//</pre>
//
//<p>&nbsp;</p>
//<p><strong>Constraints:</strong></p>
//
//<ul>
//	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
//	<li><code>1 &lt;= nums[i], target &lt;= 100</code></li>
//</ul>
//<div><div>Related Topics</div><div><li>Array</li><li>Binary Search</li><li>Sorting</li></div></div><br><div><li>👍 640</li><li>👎 33</li></div>

//leetcode submit region begin(Prohibit modification and deletion)
class TargetIndicesAfterSorting {
    fun targetIndices(nums: IntArray, target: Int): List<Int> {
        nums.sort()
        var l = findLeftMostIndex(nums,target)
        var r = findRightMostIndex(nums,target)

        if(l == -1) return emptyList()
        else return (l..r).toList()
    }

    private fun findRightMostIndex(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size -1
        var n = nums.size
        while(left<=right){
            var m = (left+right)/2
            if(nums[m] == target && m+1 <n && nums[m+1]>nums[m] ) return m
            else if (nums[m] == target && m+1 <n && nums[m+1]==nums[m]) left = m+1
            else if (nums[m]<target) left = m+1
            else if (nums[m]>target) right = m-1
            else if(nums[m] == target && m+1==n ) return m
        }
        return -1
    }

    private fun findLeftMostIndex(nums: IntArray, target: Int): Int {
        var left = 0
        var right =  nums.size -1
        while(left<=right){
            var m = (left+right)/2
            if(nums[m] == target && m-1 >=0 && nums[m-1]<nums[m] ) return m
            else if (nums[m] == target && m-1>=0 && nums[m-1] == nums[m]) right = m-1
            else if (nums[m]<target) left = m+1
            else if (nums[m]>target) right = m-1
            else if(nums[m] == target && m-1<0 ) return m
        }
        return -1
    }
}
//fun main(){
//    val s = Solution()
//    var res = s.targetIndices(intArrayOf(1,2,5,2,3),5)
//    println(res)
//}
//leetcode submit region end(Prohibit modification and deletion)
