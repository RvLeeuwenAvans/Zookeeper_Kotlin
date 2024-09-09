import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)

    var x = abs(scanner.nextInt())
    var y = abs(scanner.nextInt())

    val knight2 =
        listOf(abs(scanner.nextInt()), abs(scanner.nextInt()))

    print(inRange(x, y, knight2))
}

fun inRange(x: Int, y: Int, target: List<Int>): String {

    val targetLocation: Int = target.hashCode()

    return when(true) {
            (listOf(x +2, y +1).hashCode() == targetLocation) -> {"YES"}
            (listOf(x +2, y -1).hashCode() == targetLocation) -> {"YES"}
            (listOf(x -2, y +1).hashCode() == targetLocation) -> {"YES"}
            (listOf(x -2, y -1).hashCode() == targetLocation) -> {"YES"}
            (listOf(x +1, y +2).hashCode() == targetLocation) -> {"YES"}
            (listOf(x +1, y -2).hashCode() == targetLocation) -> {"YES"}
            (listOf(x -1, y +2).hashCode() == targetLocation) -> {"YES"}
            (listOf(x -1, y -2).hashCode() == targetLocation) -> {"YES"}
            else -> {"NO"}
        }
}

