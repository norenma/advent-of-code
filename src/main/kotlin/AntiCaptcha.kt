package Day1

import java.lang.Integer.parseInt

/**
 *
 *
 * @author markusanderssonnoren
 * @since 2017-12-01.
 */

fun formatString(s: String) : List<Int> {
    return s.toCharArray().map { s -> parseInt(s.toString()) };
}

fun doAntiCaptcha(s: List<Int> ) : Int {
    return s.reduceIndexed {i, sum, digit ->
        val next = if (i != s.size - 1) s[i + 1] else s[1]
        if(digit == next) sum + digit;
        else sum;
    }
}

fun doAntiCaptcha2(s: List<Int> ) : Int {
    return s.foldIndexed (0, {i, sum, digit ->
        val next = s[(i + s.size / 2) % s.size ]
        if(digit == next) sum + digit;
        else sum;
    })
}

