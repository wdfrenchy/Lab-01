// Returns a given greeting to a given name
fun getGreeter(greeting: String): (String) -> String {
    return {name: String -> "$greeting, $name!"}

    // If adjusted for inputs where the input type could be a variable type other than a String
    /* when (word) {
        is String -> return {name: String -> "$greeting, $name!"}
        else -> return println("Invalid input. Please try again.")
    } */
}

// Runs the program
fun main() {
    val goodbye = getGreeter("Au revoir")
    println(goodbye("Napoleon Bonaparte"))
    val hello = getGreeter("¡Buenos días")
    println(hello("Alexandros"))
    val cheers = getGreeter("Cheers")
    println(cheers("Queen Elizabeth"))
}

main()
