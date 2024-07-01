fun main() {
    val l = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val key = 5
    val result = removed(l, key)
    println(result)
}

fun removed(l: List<Int>, key: Int): List<Int> {
    val l2 = mutableListOf<Int>()
    for (i in l) {
        if (i >= key) {
            l2.add(i)
        }
    }
    return l2
}
