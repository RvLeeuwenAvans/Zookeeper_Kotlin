fun main() {
    // write your code here

    val input: Int = readln().toInt()

        print(
            when (true) {
                (-15 < input && input <= 12 ||
                    input in 15..16 ||
                        input >= 19
                ) -> "True"
                else -> "False"
            }
        )

}