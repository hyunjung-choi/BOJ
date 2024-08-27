import java.util.*
import kotlin.math.pow

/**
 * 직각삼각형
 * https://www.acmicpc.net/problem/4153
 */

private var a = 3
private var b = 4
private var c = 5
private var list = mutableListOf<Int>()
private val sb = StringBuilder()

private fun pythagoreanTheorem(heru: Int) {
    val result = list[1].toDouble().pow(2) + list[2].toDouble().pow(2)
    if (heru.toDouble().pow(2) == result) {
        sb.append("right").append("\n")
    } else {
        sb.append("wrong").append("\n")
    }
}

private fun solution() {
    list = mutableListOf(a, b, c)
    list.sortDescending()
    val heru: Int = list[0]
    pythagoreanTheorem(heru)
}

private fun input() = with(System.`in`.bufferedReader()) {

    while (true) {
        val st = StringTokenizer(this.readLine())
        a = st.nextToken().toInt()
        b = st.nextToken().toInt()
        c = st.nextToken().toInt()
        if (a == 0 && b == 0 && c == 0) {
            break
        } else {
            solution()
        }
    }

    this.close()
}

fun main() {
    input()
    println(sb)
}