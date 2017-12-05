import org.junit.Test

import org.junit.Assert.*
import java.net.URI

/**
 * @author markusanderssonnoren
 * @since 2017-12-05.
 */
class Day5KtTest {
    @Test
    fun formatDay5() {
        val resource: URI = Day4KtTest::class.java.getResource("day5.txt").toURI()
        val file = readFile(resource)
        print(formatDay5(file))
    }

    @Test
    fun day5a() {
        //day5(listOf(1, 3, 5, 1))
        val resource: URI = Day4KtTest::class.java.getResource("day5.txt").toURI()
        val file = readFile(resource)
        print(solve(formatDay5(file), 1))
    }

    @Test
    fun day5b() {
        //day5(listOf(1, 3, 5, 1))
        val resource: URI = Day4KtTest::class.java.getResource("day5.txt").toURI()
        val file = readFile(resource)
        print(solve(formatDay5(file), 2))
    }

}