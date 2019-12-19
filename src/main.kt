import java.time.LocalTime

fun main(args: Array<String>) {
    val rows = listOf(
        "800000000",
        "003600000",
        "070090200",
        "050007000",
        "000045700",
        "000100030",
        "001000068",
        "008500010",
        "090000400"
    )
    val start = LocalTime.now().toNanoOfDay()
    Sudoku(rows).solve()
    val end = LocalTime.now().toNanoOfDay()
    println("solved in ${(end - start) / 1e9} seconds")
}