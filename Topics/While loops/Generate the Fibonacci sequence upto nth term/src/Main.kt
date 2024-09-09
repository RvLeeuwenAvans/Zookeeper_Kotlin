// import required libraries
import java.util.*

// main function
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // take input
    val n = scanner.nextInt()

    //  initialize the first two integers of the Fibonacci series to 0 and 1 respectively
    var t1 = 0
    var t2 = 1

    val fibonacci = mutableListOf<Int>()

    while (fibonacci.size < n) {
        fibonacci.add(t1)

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

    print(fibonacci.joinToString(", "))
}