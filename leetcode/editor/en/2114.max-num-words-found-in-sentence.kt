package leetcode.editor.en

import java.lang.Integer.max


class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        var maxNum = 0
        sentences.forEach{ str ->
            maxNum = max(maxNum, str.count { ch ->
                ch == ' '
            } +1)
        }
        return maxNum
    }
    fun mostWordsFound2(sentences: Array<String>): Int {
        var maxNum = 0
        sentences.forEach{ str ->
            var currStr = str.split(" ")
            maxNum = if(maxNum<currStr.size) currStr.size else maxNum
        }
        return maxNum
    }
}

fun main(){
    println(Solution().mostWordsFound(arrayOf("medha is a","bullet of a shooting")))
}