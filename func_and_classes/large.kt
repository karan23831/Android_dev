fun main(){
    var largest = large(3,5)
    println(largest)
}

fun large(a : Int, b : Int ): Int{
    if(a > b){
        return a
    } else {
        return b
    }
}
