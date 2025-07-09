fun main() {
//    var sum = 0
//    var count = 0
//    for (i in 0..100) {
//        if (i % 2 == 0) {
//            println("Even Number = $i") // 0, 2, 4, 6, 8, 10
//            count++
//            sum += i
//        }
//    }
//    println("Count of Even Numbers = $count") // 6
//    println("Sum of All Even Numbers = $sum") // 30

//    var number = 1
//    val lastNumber = 20
//    var count = 0
//    var sum = 0
//    while (number <= lastNumber) {
//        if (number % 2 == 0) {
//            println("Even Number = $number")
//            count++
//            sum += number
//        }
//        number++
//    }
//    println("Count = $count")
//    println("Sum of All Even Numbers = $sum")
    var number = 1
    val lastNumber = 5
    var count = 0
    var sum = 0
    while (number <= lastNumber) {
        if (number % 2 == 0) {
            isEven(number)
            count++
            sum = sum(sum, number)
        }
        number++
    }
    println("Count = $count")
    println("Sum of All Even Numbers = $sum")
}

fun isEven(number: Int) {
    println("Even Number = $number")
}

fun sum(sum: Int, number: Int): Int {
    var sum = sum
    var number = number
    sum += number
    return sum
}


// Pseudo-Code For Understanding
// Any-number % 2 = 0 => Even
// count = count + 1
// sum = sum + i


// first find the even numbers in your range
// Count all even numbers and
// get sum of all

