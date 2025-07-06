fun main() {
    println("........Comparison Operators...........")
// == != >  >= < <= operators

    val a = 3
    val b = 4

    println( a == b)
    println( a != b)
    println( a > b)
    println( a < b)
    println( a <= b)
    println( a >= b)
    println("......................")

    val myNumber = 100

    if (myNumber != 150) { // Comparison not Op
        println("NOT Equal to 150")
    } else if (myNumber <= 150) {
        println("Less than or equal to  150")
    } else {
        println("All the conditions failed")
    }

    println("......... Comparison Not Operator => != For No, Str, Obj...............")
    println("......... Logical Not Operator => ! => For Boolean Op ...............")

    val isActive = false

    if (!isActive){ // Logical not Op
    println("The user is active")
    }else {
    println("The user is not active")
    }

}