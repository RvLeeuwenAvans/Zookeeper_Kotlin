import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    // Compare the two numbers and print the results
    println(num1 < num2)
    println(num1 == num2)
    print(num1 > num2)
}