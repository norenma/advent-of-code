/**
 *
 *
 * @author markusanderssonnoren
 * @since 2017-12-03.
 */
private fun Int.isPositive(): Boolean {return this > 0}
private fun Int.isNegative(): Boolean {return this < 0}
private val Int.abs: Int get() { return Math.abs(this) }

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

class Point(val x: Int, val y: Int)

fun getSol (number: Int): Int {
    var p = Point(1, 0)
    var deviation = 1
    var direction = Direction.NORTH
    for (i in 3..number) {
        when {
            // Check if needs turning
            p.x.isPositive() && p.y.isPositive() && (p.y.abs == deviation) -> direction = Direction.WEST
            p.x.isNegative() && p.y.isPositive() && (p.x.abs == deviation) -> direction = Direction.SOUTH
            p.x.isNegative() && p.y.isNegative() && (p.y.abs == deviation) -> direction = Direction.EAST
            p.x.isPositive() && p.y.isNegative() && (p.x.abs == deviation + 1) -> {
                direction = Direction.NORTH
                deviation++;
            }
        }
        p = move(p, direction)
    }
    return p.x.abs + p.y.abs
}


fun move(p : Point, d: Direction): Point {
    return when (d) {
        Direction.EAST -> Point(p.x + 1, p.y)
        Direction.NORTH -> Point(p.x, p.y + 1)
        Direction.SOUTH -> Point(p.x, p.y - 1)
        Direction.WEST -> Point(p.x - 1, p.y)
    }
}