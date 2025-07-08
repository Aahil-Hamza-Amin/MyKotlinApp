// Function-Overloading = > Same F-name with different Signature, Same or diff Functionality, same class
// Signature can be Different in type, No., Order of Parameters/Input
// Only returnType different would cause an error
// Same class, Compiler Check at compile-Time, Compile-Time Polymorphism(Static PolyMorphism)

// Function-Overriding = > Same F-name with same Signature, Diff Functionality(Extend in child), diff class(parent-> child)
// Also MethodOverriding => Runtime-Polymorphism or Dynamic Polymorphism or Dynamic binding
fun main() {
//    val max = getMax(5, 7) // For First Fn
//    val max = getMax(5.5, 7.3) For 2nd Fn with Changing Types
    val max = getMax(5, 7, 10) // For 3rd Changing Parameters No.s
    println(max)

//   Only For Reference:  getData("Hamza", 22)
//   getData(22, "Hamza") // Changing Order of Parameters

}

fun getMax(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

// 1) Changing Type of Inputs
fun getMax(num1: Double, num2: Double) = if (num1 > num2) num1 else num2

// 2) Changing No.of Inputs
fun getMax(num1: Int, num2: Int, num3: Int): Int {
    return if (num1 >= num2 && num1 >= num3) num1 // Here short-circuit-Evaluation Happens
    else if (num2 >= num1 && num2 >= num3)
        num2
    else num3

//    Wrong Practice => so Only use one single return statement rather than three
//    if (num1 >= num2 && num1 >= num3) return num1 // Early Function Exits
//    else if (num2 >= num1 && num2 >= num3)
//        return num2 // Early Function Exits
//    else return num3 // Early Function Exits
}