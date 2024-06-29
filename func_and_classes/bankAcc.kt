class BankAccount{
    var accountNumber: Int = 0
    var balance: Int = 0
    
    fun deposit(amt: Int){
        balance = balance + amt
    }
    
    fun withdraw(amt: Int){
        balance = balance - amt
    }
    
    fun getbalance(): Int{
        return balance
    }
}

fun main(){
    val customer = BankAccount()
    customer.accountNumber = 12345
    customer.balance = 5000
    println(customer.getbalance())
    customer.deposit(500)
    println(customer.getbalance())
    customer.withdraw(600)
    println(customer.getbalance())
}
