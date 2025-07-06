// Operators are symbols that perform some actions on operands
//    uni/mono-Operators
//    Bi-Operators etc.
fun main() {
//    Add Two Numbers
    var num1 = 5
    val num2 = 3
    // => To get less pression(Accuracy after fractional/decimal part) use Float, for more use Double

    var result = num1 + num2
println("Sum of $num1 and $num2 = $result")

//    Mathematical/Arithmetic Operators
println("...........Arithmetic Operators.........")
println("num1 + num2 = ${num1 + num2}") // {} => Expression used for => Evaluation to get single value
println("num1 - num2 = ${num1 - num2}")
    println("num1 * num2 = ${num1 * num2}")
    println("num1 / num2 = ${num1 / num2}") // Int so it dropped the Fractional Part => result 1 rather than 1.66 so use one of operands as double or float
println("num1 % num2 = ${num1 % num2}")

// Operators Precedence (L to R) except for Unary Op with (R-L)
println("...........Arithmetic Op Precedence.........")
//    () => highest, *,/,% => medium, +,- => low
    println("3 + 3 * 4 = ${3 + 3 * 4}") // 3 + 12 => 15
    println("3 + 3 * 4 = ${(3 + 3) * 4}") // 6 * 4 = 24

//    Assignment Operators => Increment/decrement by current value
    println("...........Compound Assignment Operators.........")

    result += 2  // Or    result = result + 2
    println("result = $result")

    result -= 2 // Or  result = result - 2
    println("result = $result")

    result *= 2 // Or result = result * 2
    println("result = $result")

    result /= 2 // Or result = result / 2
    println("result = $result")

    result %= 2 // Or result = result % 2
    println("result = $result")

//    Increment/Decrement by 1
    println("...........Increment/Decrement Op.........")
    /*
    A) Increment Op
    PostFix Increment Op => First Output of Value Then Incremented by 1
    PreFix Increment Op => Incremented by 1 And at the same time Output the value
    B) Decrement Op
    PostFix Decrement Op => First Output the Value And then decrement the value
    Prefix Decrement Op => Decrement the Output And At the same time decrement the value
    */


    num1 = 0
//    If We Comment one of these so output is Accordingly
    println("...........PostFix Increment Op.........")
    println("num1++ = ${num1++}") // Output is 0 and incremented by 1 // Without Comments Now 0
    println("num1++ = ${num1++}") //Output is 1 and incremented by 1 // Without Comments Now 1
    println("num1 = $num1") //Output is 2 // Without Comments Now 2

    println("...........PreFix Increment Op.........")
    println("++num1 = ${++num1}") // Incremented by 1 and At the same time output is 1 // Without Comments Now 3
    println("++num1 = ${++num1}") // Incremented by 1 and At the same time output is 2 // Without Comments Now 4
    println("num1 = $num1") //Output is 2 // // Without Comments Now 4

    println("...........PostFix Decrement Op.........")
    println("num1-- = ${num1--}") // Output is 0 and decremented by 1 // Without Comments Now 4
    println("num1-- = ${num1--}") // Output is -1 and decremented by 1 // Without Comments Now 3
    println("num1 = $num1") //Output is -2 // Without Comments Now 2

    println("...........PreFix Decrement Op.........")
    println("num1-- = ${--num1}") //First decremented by 1 And at the same time output is -1 // Without Comments Now 1
    println("num1-- = ${--num1}") // First decremented by 1 And at the same time output is -2 // Without Comments Now 0
    println("num1 = $num1") //Output is -2 // Without Comments Now 0
}