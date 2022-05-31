// O(n) time O(n) space
class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty()) return 0
        var left = 0
        var gMax = 0
        val hMap = mutableMapOf<Char,Int>()
        s.forEachIndexed{ right,it ->
            if(hMap.containsKey(it)){

                if(hMap[it]!!>=left)
                    left = hMap[it]!!+1
                else{
                    val lMax = right-left+1
                    gMax = if(gMax<lMax) lMax else gMax
                }

            }else{
                val lMax = right-left+1
                gMax = if(gMax<lMax) lMax else gMax
            }
            hMap[it] = right
            //println("$hMap,$left,$right, $gMax $it")

        }
        return gMax
    }
}
fun main(){
    val s = LongestSubstringWithoutRepeatingCharacters()
    println(s.lengthOfLongestSubstring("abcabcbb"))
}

/*

jcksbnd

l = 8
r = 11

hMap
h - 0
j - 10
b - 11
c - 4
s - 6
n - 8
d - 9
k - 5
s -

I missed a case where let's say an element has already been seen in previous windows and left has moved past that point

right is moving ahead at every iteration so window size is increasing - a max can occur there as well

max = 7  [r-l+1]
*/