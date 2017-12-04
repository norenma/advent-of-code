import java.io.File
import java.io.InputStream
import java.net.URI
import java.net.URL

/**
 *
 *
 * @author markusanderssonnoren
 * @since 2017-12-04.
 */
fun formatDay4 (s: String): List<List<String>> {
    return s.split("\n").map { row -> row.split(" ") }
}

fun readFile(name: URI) : String {
    val inputStream: InputStream = File(name).inputStream()
    return inputStream.bufferedReader().use { it.readText() }
}

fun testRow(row: List<String>): Boolean {
    val last: Int = row.size - 1;
    for ((i, first) in row.withIndex()){
        for(j in (i+1)..last) {
            if(first.equals(row[j])) return false
        }
    }
    return true
}
fun day4(input : List<List<String>>): Int {
    return input.filter { row -> testRow(row) }.size
}

fun isAnagram(first: String, second: String) : Boolean {
    if(first.length != second.length)
        return false
    val firstLetters = first.toCharArray().toMutableList()
    val letters = second.toCharArray().iterator()
    while(letters.hasNext()) {
        var wasRemoved = firstLetters.remove(letters.next())
        if (!wasRemoved)
            return false
    }
    return true
}

fun testRow2(row: List<String>): Boolean {
    val last: Int = row.size - 1;
    for ((i, first) in row.withIndex()){
        for(j in (i+1)..last) {
            if(isAnagram(first, row[j])) return false
        }
    }
    return true
}


fun day4b(input : List<List<String>>): Int {
    return input.filter { row -> testRow2(row) }.size
}