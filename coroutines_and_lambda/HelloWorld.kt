import kotlinx.coroutines.*

fun main() = runBlocking {
    
    println("Hello")
    launch{
        delay(1000L)
        println("World")
    }
    println("Program Completed")
}
