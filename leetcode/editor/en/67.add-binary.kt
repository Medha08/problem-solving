/*
 * @lc app=leetdigitToInt() id=67 lang=kotlin
 *
 * [67] Add Binary
 */

// @lc digitToInt()=start
//digitToInt()
//O(N) time O(N) space
class AddBinary {
    fun addBinary(a: String, b: String): String {
        var c = a.reversed()
        var b = b.reversed()
        var e = mutableListOf<Char>()
        var carry = 0
        var i = 0


        while(i<c.length && i<b.length){
            if((c[i].findValue() + b[i].findValue() + carry) == 3){
                carry = 1
                e.add('1')
            }else if((c[i].findValue() + b[i].findValue() + carry) == 2 ){
                carry = 1
                e.add('0')
            }
            else if((c[i].findValue() + b[i].findValue() + carry) == 1 ){
                carry = 0
                e.add('1')
            }else {
                carry = 0
                e.add('0')
            }
            i += 1

        }


        while(i<c.length){
            if(carry + c[i].findValue() == 2){
                carry = 1
                e.add('0')
            }else if(carry  + c[i].findValue() == 1) {
                carry = 0
                e.add('1')
            }else {
                carry = 0
                e.add(c[i])
            }
            i += 1
        }

        while(i<b.length){
            if(carry + b[i].findValue() == 2){
                carry = 1
                e.add('0')
            }else if(carry  + b[i].findValue() == 1) {
                carry = 0
                e.add('1')
            }else {
                carry = 0
                e.add(b[i])
            }
            i += 1
        }
        if(carry==1)
            e.add('1')

        return e.reversed().joinToString("")
    }

    fun Char.findValue() : Int{
        return if(this == '0') 0 else 1
    }
}

fun main(){
    val s = AddBinary()
    val a = "100010"

    val b = "11"
    println(s.addBinary(a,b))
}
// @lc digitToInt()=end

