fun main() {
    val l1 = listOf(1,2,3,5)
    val l2 = listOf(1,2,3,4,5)
    println(isSubset(l1,l2))
}

fun isSubset(l1: List<Int>,l2: List<Int>): Boolean {
    
    val set2 = l2.toSet()
    
    for(i in l1){
        if(i !in set2){
            return false
        }
    }
    
    return true
}
