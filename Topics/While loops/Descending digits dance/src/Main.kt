import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var number = scanner.nextInt()

    // Implement the countdown using a while loop
    while(number > 0) {
        println(number)
        number--
    }
}