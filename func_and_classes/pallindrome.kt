fun main(){
    var s = "racecar"
    if(pallindrome(s)==true)
    {
        println("Palindrome")
    }
    else
    {
        println("Not Palindrome")
    }
}

fun pallindrome(s: String): Boolean{
    var n = s.length-1
    var s2 = ""
    
    for(i in 0..n){
        s2 = s2 + s[n]
        n--
    }
    
    if(s2 == s){
        return true
    }
    else{
    return false
    }
