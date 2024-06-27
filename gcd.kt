fun main() {
    val number1 = 56
    val number2 = 98

    var a = number1
    var b = number2

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }

    val gcd = a
    println("The GCD of $number1 and $number2 is $gcd")
}
