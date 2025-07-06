fun main() {
    val isActive = true //or use false

//    if (isActive == true ) => this works same as (isActive)
    if (isActive) {
        println("This Block will be Executed only if the condition is true unless won't get executed")
        println("The condition is true.")
    } else {
        println("The condition is false")
    }

    println(".........Comparison/Relational Operators........")

    val myNumber = 5

    if (myNumber >= 5)
        println("The number is grater than 5")
    else if (myNumber >= 4)
        println("The number is greater than 4")
        else
        println("The number is less than 4")
}