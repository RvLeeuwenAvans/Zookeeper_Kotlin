import java.util.Scanner
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    var originalBalance = readln().toInt()
    var newBalance = originalBalance

    var message: String

    do {
        val newPurchase = scanner.nextInt()

        if (newBalance - newPurchase < 0) {
            message = "Error, insufficient funds for the purchase." +
                    " Your balance is $newBalance, but you need " +
                    "${newBalance + abs(newBalance - newPurchase)}."
            break
        }

        newBalance -= newPurchase

        message = "Thank you for choosing us to manage your account! " +
                "Your balance is $newBalance."
    } while (scanner.hasNextInt())

    print(message)
}