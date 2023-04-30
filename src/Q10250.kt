import java.util.*

/**
 * https://www.acmicpc.net/problem/10250
 * ACM 호텔
 */

private var t = 0
private var h = 0
private var w = 0
private var n = 0
private val sb = StringBuilder()

private fun solution() {
    val quotient = n / h
    val remainder = n % h
    val x: Int
    val y: Int

    if (remainder == 0) {
        y = h * 100
        x = n / h
    } else {
        y = remainder * 100
        x = quotient + 1
    }
    sb.append(x + y).append("\n")
}

private fun input() = with(System.`in`.bufferedReader()) {
    t = Integer.parseInt(this.readLine())

    repeat(t) {
        val st = StringTokenizer(readLine())
        h = Integer.parseInt(st.nextToken())
        w = Integer.parseInt(st.nextToken())
        n = Integer.parseInt(st.nextToken())
        solution()
    }

    this.close()
}

fun main() {
    input()
    println(sb)
}