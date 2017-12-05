import java.lang.Integer.parseInt

/**
 *
 *
 * @author markusanderssonnoren
 * @since 2017-12-05.
 */
fun formatDay5 (s: String): List<Int> {
    return s.split("\n").map { parseInt(it) }
}

fun solve(input: List<Int>, task: Int): Int {
    var pos = 0
    val mList = input.toMutableList()
    var steps = 0;
    while(pos in 0..(input.size -1)) {
        val jumps = mList[pos]
        if (jumps >= 3 && task == 2) mList[pos]-- else mList[pos]++
        pos += jumps
        steps++
    }
    return steps
}