// Types of Functions
// 1) Simple(Non-Parametric)
// 2) Parametric Functions
// 3) Default Parametric Functions

fun main(){
//sendMessage("Hamza", "Hello!") // Normal call
//sendMessage() // No arguments passed as of Default Parameters Used
//sendMessage(message = "Hello", name = "Arman") // Named Parameters irrespective of the order
sendMessage(name = "Arman") // Named Parameters irrespective of the order
}

// Default Parametric Function => User don't pass any arguments while invocation 
// default value is replaced by passed value
// Default parameters can have variables, functions or strings etc.
fun sendMessage(name: String = "User", message: String = sendText()){
    println("Name = $name and message = $message")
}

fun sendText() ="some Text!"
