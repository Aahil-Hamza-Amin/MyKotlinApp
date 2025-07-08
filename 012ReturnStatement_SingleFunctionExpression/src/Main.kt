fun main() {
    val max = getMax(5, 9)
    println(max)
}

//fun getMax(num1: Int, num2: Int): Int {
////    1) Use the either way to use one return Statement or store if-else in another variable and then return one varible
//
////    if (num1 > num2) return num1 else return num2
//
////    2) Recommended to use if-else stored in variable
//
////    val max = if (num1 > num2) num1 else num2
////    return max
//
////    3) Most Recommended to just return if-else as variable is not used anywhere
//    return if (num1 > num2) num1 else num2
//}

//    Below Return statement Nothing will be executed or Unreached Code
//    We cannot return two /VariablesValues Or We cannot use two return Statements in a function

//   ............Single Function Expression...........

//  Use when only single Line of Code => Remove {}, return Statement, Return-Type 
fun getMax(num1: Int, num2: Int) = if (num1 > num2) num1 else num2
