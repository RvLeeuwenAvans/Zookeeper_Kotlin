import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the two numbers
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    // TODO: Compare the two numbers and print the result
    // Use the relational operators (<, >, ==) to compare num1 and num2
    // Print '>' if num1 is greater than num2
    // Print '<' if num1 is less than num2
    // Print '=' if num1 is equal to num2
    if (num1 == num2) print("=")
    else if (num1 > num2) print(" > ")
    else print(" < ")

}