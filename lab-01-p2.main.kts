// Returns the first letter and the length of a given word
fun bingoWord(word: String): String {
    return word.first().uppercase() + " " + word.length

    // If adjusted for inputs where the input type could be a variable type other than a String
    /* when (word) {
        is String -> return word.first().uppercase() + " " + word.length
        else -> return println("Invalid input. Please try again.")
    } */
}

// Runs the program
fun main() {
    println(bingoWord("Birthday"))
}

main()
