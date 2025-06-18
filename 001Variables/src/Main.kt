//main() => Entry Point of our program
//fun main() {
//    println("Hello, World!")
//}

fun main() {
// 1)    Datatype: String(sequence of Characters/text)
//    Created Variable with var
//    Created Variable with val => cannot re-assigned
    var userName: String = "Hamza" //Created
    userName = "Aahil" // Modified
//    userName = 5 //Not Allowed => Statically-Typed lang => check type at compile time rather tah at run-time
//    println("Hello $userName!")

// 2)    Datatype: Int => wholeNumbers
    var age: Int = 22
    age = 25
//    age = "Hamza" => not Allowed: statically-typed lang
    println("Hello $userName! your age is $age")
}

//Note: kotlin can infer(extract) type of variable/data based on its passed value
//Ex: var userName = "Hamza"
//ratherThen: var userName: String = "Hamza"

