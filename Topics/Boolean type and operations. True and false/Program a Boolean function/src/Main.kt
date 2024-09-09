fun main() {
    val x = readlnOrNull().toBoolean() // read other values in the same way
    val y = readlnOrNull().toBoolean()
    val z = readlnOrNull().toBoolean()

    print(!(x && y) || z)
}