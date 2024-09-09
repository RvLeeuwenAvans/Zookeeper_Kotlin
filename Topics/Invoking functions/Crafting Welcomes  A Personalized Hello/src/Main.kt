fun main() {
    // Initialize standard input
    val input = readlnOrNull() ?: ""

    // Define a function to generate a greeting
    fun generateGreeting(name: String) = "Hello, $name"

    // Print the result of the invoked function
    println(generateGreeting(input.trim()))
}