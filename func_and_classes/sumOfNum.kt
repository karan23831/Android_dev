fun main(){
    var sum = sumOfList(1,2,3,4,5)
    println(sum)
}

fun sumOfList(vararg num: Int): Int{
    var sum = 0
    for(i in num){
        sum = sum + i
    }
    return sum
}
