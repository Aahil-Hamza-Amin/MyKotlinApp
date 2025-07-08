fun main() {
//    sum(5, 6, 7, 10, 5,6,8,9,6,3,6) // for forEach Loop
    println(sum(5, 6, 7, 10, 5,6,8,9, 6,3,6))
}

//vararg use to pass more than many parameters behaves like creating an array
//It should passed at the last of of parameters list

fun sum(vararg numbers: Int): Int {
    var result = 0

    for (number in numbers){
        result += number // result = result + number
    }

    return result

}

//    Or use

//fun sum(vararg numbers: Int) {
//    numbers.forEach { println(it) }
//}