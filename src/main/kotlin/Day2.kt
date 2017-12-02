import java.lang.Integer.parseInt

/**
 *
 *
 * @author markusanderssonnoren
 * @since 2017-12-02.
 */

fun formatString (s: String): List<List<Int>> {
    return s.split("\n").map { row -> row.split("\t").map { parseInt(it) } }
}

fun getCheckSum(input: List<List<Int>>) : Int {
    return input.fold(0, {sum, row ->  sum + row.max()!! - row.min()!! })
}

fun getEvenDivisible(input: List<List<Int>>) : Int {
    return input.fold(0, {sum, row ->
        sum + getEvenDivisibleRow(row)
    })
}

fun getEvenDivisibleRow(list : List<Int>): Int {
    var sum = 0
    list.withIndex().forEach { (i, vi) -> list.filterIndexed { j, vj -> (vi % vj == 0) && i != j }.forEach { sum += vi/ it } }
    return sum
}