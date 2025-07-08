fun main() {
// Null => Nothing => Explicitly Absenence of Value => no Value, no Memory Reference
//  Null Values / Null Pointers Exceptions(NPE) => occur at Runtime not Compile Time

//  1)  Manual Check if its Null
//    var text: String? = "Name"
//    text = null
//
//    if (text != null) {
//        println(text.length)
//    } else {
//        println("The variable is null")
//    }
//    2) Safe Call Operator ? checks like if conditions as if its null
//    var text: String? = null
//    text = "Some text"
//    println(text?.length)

    //    2) Force call Operator !! if its null then throw NPE if not show value
//    var text: String? = null
//    text = "Some text"
//    println(text!!.length)

    //    2) Elvis Operator ?: if its left is null, assign value right to it
    var text: String? = null
    text = "This variable is not null"
    val text2: String = text ?: "The variable is null"
    println(text2)
}