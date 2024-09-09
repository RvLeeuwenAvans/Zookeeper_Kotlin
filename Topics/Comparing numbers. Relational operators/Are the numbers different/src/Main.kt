fun main() {
    // put your code here
    val input1: Int = readln().toInt()
    val input2: Int = readln().toInt()
    val input3: Int = readln().toInt()

    if (input1 % input2 == 0) print(false) else
        if (input1 % input3 == 0) print(false) else
            if (input3 % input2 == 0) print(false) else print(true)
}
