fun main() {
    val msg = "Hello"
    val result = nullstr(msg)
    println(result)  

    val nullMsg: String? = null
    val nullResult = nullstr(nullMsg)
    println(nullResult)  
}

fun nullstr(s: String?): Int {
    return s?.length ?: -1
}
