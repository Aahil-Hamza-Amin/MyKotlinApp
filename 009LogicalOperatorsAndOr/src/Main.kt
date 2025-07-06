fun main() {
    println(".........Logical And Operator..........")
// Logical And Operator => Combine two expressions returns true or false
// Returns true when both are true and goes to second expression if first is true otherwise false and its called shortCircuitEvaluation
//    val isActive = true
//    val score = 100
//    val intervalSpeed = 5000
//
//    if (isActive && score == 100 && intervalSpeed == 5000) {
//        println("You are at the next level.")
//    } else {
//        println("You are at the same level.")
//    }

    println(".........Logical Or Operator..........")
//  Logical Or Operator => returns true if one expression is true or both are true otherwise false i both are false
//  returns true when At-least one expression is true even the second one
    val num1 = 5
    val num2 = -4
//    val text = if (num1 > 0 || num2 > 0) "This is text 1" else "This is text 2"
    val text = if (num1 > 0 || num2 > 0) {
        println("This condition is true")
        "This is text 1"
    } else {
        println("This condition is false")
        5
    }
    println("$text")
//  Note: If you Don't use the {} for if-else statements and there more than 1 statements
//  First statement is executed in response to if-else while all other statements executed in response to flow of program/code

}