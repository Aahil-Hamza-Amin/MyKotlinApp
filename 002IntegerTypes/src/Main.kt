fun main() {
//  1) Strings
//  2)  Int max and min Range
    val number = 23

    val integerMaxValue = Int.MAX_VALUE
    val integerMinValue = Int.MIN_VALUE
    println("Integer max value: $integerMaxValue")
    println("Integer min value: $integerMinValue")

//  3)  Bytes max and min Range
    val byteMaxValue: Byte = Byte.MAX_VALUE
    val byteMinValue: Byte = Byte.MIN_VALUE
    println("Byte max value: $byteMaxValue")
    println("Byte min value: $byteMinValue")

//  4) Short max and min Range
    val shortMaxValue: Short = Short.MAX_VALUE
    val shortMinValue: Short = Short.MIN_VALUE
    println("Short max value: $shortMaxValue")
    println("Short min value: $shortMinValue")

//  5) Long max and min Range
    val longMinValue: Long = Long.MAX_VALUE
    val longMaxValue: Long = Long.MIN_VALUE
    println("Long max value: $longMaxValue")
    println("Long min value: $longMinValue")
//    Use Either of these Ways
//    val longNumber = 288999999999999 // within long range
//    val lonNumber = 28L
//    val longNumber: Long = 28

//    Note: by default : infer(extract) datatype: Int
    val myNumber = 28 // Int

//    Space Occupies by datatypes
// Byte : 1byte = 8 bits(1 * 8) = 8  of width
// Short : 2byte = 16 bits(2 * 8) = 16 of width
// Int : 4byte = 32 bits(4 * 8) = 8 of width
}