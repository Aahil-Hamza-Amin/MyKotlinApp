fun main() {
    sayHello("Hamza", 22)
//    sayHello() // Reusable mean we can call them as may times

    val hasInternetConnection = false
    if (!hasInternetConnection){
        getData("Some data") // chunk of code
    } else {
    showMessage() // Another chunk of code => so divided into diff chunks of code
    }
}

//We pass the Type explicitly to parameters b'cs there is no way to infer type from this
fun sayHello(name: String, age: Int) {
    var age = age
    age = 25
    println("Hello, $name! Your age is $age")
}

fun getData(data: String){
    println("Your data is: $data")
}

fun showMessage(){
    println("There's no internet connection")
}

// Functions are chunks of code or reusable, named block of organized, related clean code that perform specific Actions/Tasks
// Accepts Inputs(Parameters), process them, and returns an output(result value)
// We can break larger tasks into smaller One's to make them reusable by calling them


