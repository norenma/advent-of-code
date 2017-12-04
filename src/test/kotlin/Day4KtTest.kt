import com.sun.jndi.toolkit.url.Uri
import org.junit.Test
import java.io.File
import java.net.URI
import java.net.URL

/**
 * @author markusanderssonnoren
 * @since 2017-12-04.
 */
class Day4KtTest {
    val input = null
    @Test
    fun formatDay4() {
        val resource: URI = Day4KtTest::class.java.getResource("input4.txt").toURI()
        print(formatDay4(readFile(resource)))
    }

    @Test
    fun day4() {
        val resource: URI = Day4KtTest::class.java.getResource("input4.txt").toURI()
        print(day4(formatDay4(readFile(resource))))
    }

    @Test
    fun testRow() {
        val row = formatDay4("aa bb cc dd aa")[0]
        print(row)
        print(testRow(row))
    }

    @Test
    fun isAnagram() {
        print(isAnagram("gtr", "rgt"))
        print(isAnagram("gtr", "rgtfr"))
        print(isAnagram("gtrrf", "rfgtr"))
    }

    @Test
    fun testRow2() {
        print(testRow2(formatDay4("a ab abc abd abf abj")[0]))
        print(testRow2(formatDay4("oiii ioii iioi iiio")[0]))
    }

    @Test
    fun day4b() {
        val resource: URI = Day4KtTest::class.java.getResource("input4.txt").toURI()
        print(day4b(formatDay4(readFile(resource))))
    }

}