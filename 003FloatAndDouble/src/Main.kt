fun main() {
//  6) Float
//    val myNumber: Float = 2.5 => Wrong Way
//    val myNumber: Float = 2.5F // => Right Way : use f or F but redundant type or Explicit Type
    val myNumber = 2F // 2.0F or 2.0f => Right Way : use f or F

//  7) Double
    val  mySecondNumber = 2.0
//    val  mySecondNumber: Double = 2.0 => Explicit Type
//    val mySecondNumber: Double = 2 => not Allowed because by default its type would be Int
    println("myNumber = $myNumber and mySecondNumber = $mySecondNumber")


//    Note: By default infer Type : Double
//    Ex: myNumber = 2.5 => Double
//    Floating Point Number has Smaller precision than Double
}