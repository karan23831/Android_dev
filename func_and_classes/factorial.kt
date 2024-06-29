fun main(){
    var f = 5
    var fact = factorial(f)
    println(fact)
}

fun factorial(f : Int): Int{
    var fact = 1;
    
    for(i in 1..f){
        fact = fact * i
    }
    return fact
}
