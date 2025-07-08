fun main() {
    println(".........For Loop...........")
//    For-Loop =>loops for specific number of times
// In range .. last number is included
//   for (i in 1..10){
//       println("i = $i")
//   }

// In until => last number is excluded
//    for(i in 1 until 10){
//        println(i)
//    }

// opposite to range
//    for(i in 10 downTo 1){
//        println(i)
//    }

//  Skip and move(step) to the specific number
//    for (i in 1 until 10 step 5){
//        println(i)
//    }

//    for (i in 1..10){
//        println(i)
//    }

    println(".........While Loop...........")
//   loops As long as condition/expression is true
//    var number = 0
//    while (number < 10) {
//        number++
//        if (number == 7) {
//            break
//        }
////        if (number > 2 && number < 7) {
//////        if (number in 3 .. 7) { //same as Above
////            continue
////        }
//        println(number)
////  If You don't increment in number => becomes Infinite Loop as condition always true
//    }
//continue keyword => bypass the section of code(skip the number)

//for (i in 0..10 ){
//    if(i in 3..8){
//        continue
//    }
//    println(i)
//}
    println(".........Do While Loop...........")
//    At-least wants to execute code once irrespective of condition/expression
//    var number = 10
//    do {
//        println(number)
//        number++
//    } while (number < 10)

    println("........Nested Loop.......")

    var number = 0
//    label => to break outer loop rather than only brak to terminate inner loop only
    outer@ while (number < 5) {
        number++
        println(number)

        var i = 0
        while (i < 5) {
            if (i == 0) break@outer
            i++
            println("***$i")
        }
    }

}

