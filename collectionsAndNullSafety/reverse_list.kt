fun main() {
    var l = listOf(1,2,3,4,5)
    rev(l)
}

fun rev(l: List<Int>){
    val l2 = mutableListOf<Int>()
    var c = l.size-1
    for(i in l){
        l2.add(l[c])
        c--
    }
    println(l2)
}
