//  KotlinSourceCode => JDK(Kotlin Compiler) =>JavaByteCode =>JVM() =>Machines's NativeCode(for Win/Linux/Mac)
//  Entry/Starting Point
//fun main(){
//    println("Hello Hamza!")

//    Kotlin Statically Types Lang => check type of value at compile/build time not at runtime
//    val userName = "Hamza" // cannot reassigned
//    var userName: String = "Hamza" // Type Redundant

//    var userName = "Hamza" // Kotlin is Type Inferred Lang => check/inferred type of variable based on value
//
//    userName = "Hamza Mughal"
//
//    var age = 22
//    age = 25
//    println("Hello $userName your age is $age!")

//}

fun main() {
//  ..............DataTypes => Primitive DataTypes...............
//  String, Char, Boolean, Byte, Short, Int, Long, Float, Double
//  1) String => sequence/combinations of char
    val name = "Hamza"
//  2) For Whole Number => Number / Int => Default type Inferred for Whole Number is also Int While Explicitly defined are Byte, Short, Long
//    Int Occupies 32 bits
    val number = 23
    println("Hello $name! Your age is $number")
//    Range of Int
    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE

    println("Integer max value: $integerMaxValue")
    println("Integer min value: $integerMinValue")
//  3) For Whole Number =>Bytes => having amount of space/ Occupies 8 bits
//    val myNumber: Byte = 28 //Explicitly defined whole Number
    val byteMaxValue: Byte = Byte.MAX_VALUE
    val byteMinValue: Byte = Byte.MIN_VALUE

    println("Bytes max value: $byteMaxValue")
    println("Bytes min value: $byteMinValue")
//  4) For Whole Number =>Short => Occupies 16 bits
//    val myNumber: Short = 28 //Explicitly defined whole Number
    val shortMaxValue: Short = Short.MAX_VALUE
    val shortMinValue: Short = Short.MIN_VALUE

    println("Short max value: $shortMaxValue")
    println("Short min value: $shortMinValue")
//  5) For Whole Number =>Long
    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE
//    val myNumber: Long = 28 //Or Okay
//    val myNumber = 28L //Okay for long

    println("Long max value: $longMaxValue")
    println("Long min value: $longMinValue")
//  6) Float => Fractional/Decimal Part => by Default type of decimalNumber is Double
//    val myNumber: Float = 2.0F // Not allowed for Float
//    val myNumber = 2.0f or 2F// Okay for Float with f/F

    val floatMaxValue = Float.MAX_VALUE
    val floatMinValue = Float.MIN_VALUE

    println("Float max value: $floatMaxValue")
    println("Float min value: $floatMinValue")
//  7) Double => By default Type For DecimalPart
//    val myNumber = 2.8
//    val myNumber: Double = 2.0 //allowed
//    val myNumber: Double = 2 //Not allowed as its Int

    val doubleMaxValue = Double.MAX_VALUE
    val doubleMinValue = Double.MIN_VALUE

    println("Double max value: $doubleMaxValue")
    println("Double min value: $doubleMinValue")
//  8) Char => useCase=> ex: last key pressed by user
    val myCharValue = 'D' // never used "" in Char
//    val char: Char = 'a' //Redundant
//    println("$myCharValue") //may use this or the next one
    println(myCharValue)
//  9) Boolean => not allowed 1 0r as they are Int
    val myBooleanValue = true
//    val myBooleanValue = false or 1 or 0 is not boolean here as its Int
//    val myBooleanValue: Boolean = false
    println(myBooleanValue)
    println("myCharValue = $myCharValue and myBooleanValue = $myBooleanValue")
}
