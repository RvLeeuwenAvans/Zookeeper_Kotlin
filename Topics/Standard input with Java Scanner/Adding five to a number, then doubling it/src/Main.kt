import java.util.Scanner

fun main(args: Array<String>) {
    // TODO: Use the nextInt() method of the Scanner class to read an integer from the standard input.
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt() + 5

    // Then, add five to the read number and multiply the result by two.
    // Finally, print the result of the multiplication to the standard output.
    print(n * 2)
}