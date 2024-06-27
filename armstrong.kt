fun main() {
    val a = 153  
    var temp = a
    var s = 0

    while (temp != 0) {
        val r = temp % 10
        s += r * r * r
        temp /= 10
    }

    if (s == a) {
        println("Armstrong")
    } else {
        println("Not Armstrong")
    }
}
