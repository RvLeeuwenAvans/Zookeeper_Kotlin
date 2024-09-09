fun main(args: Array<String>) {
    // Initialisation of a Scanner
    val input = readln().split(" ")

    // TODO: Get input string line
    // TODO: Use split to create an array
    // TODO: Iterate over array to convert from String to Int and accumulate the sum
    // TODO: Print the sum.
    var sum = 0

    for (i in input) {
        sum += i.toInt()
    }

    print(sum)
}