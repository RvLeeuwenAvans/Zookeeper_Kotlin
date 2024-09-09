fun main() {
    // put your code here
    val group1: Int = readln().toInt()
    val group2: Int = readln().toInt()
    val group3: Int = readln().toInt()

    val groupList = listOf(group1, group2, group3)

    var totalTables = 0;

    for (group in groupList) {
        totalTables += (group / 2 + (group % 2))
    }

    println(totalTables)
}