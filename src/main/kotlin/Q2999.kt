/**
 * 비밀 이메일
 * https://www.acmicpc.net/problem/2999
 */

private fun findRC(N: Int): Pair<Int, Int> {
    var R = 1
    var C = N
    val sqrtN = Math.sqrt(N.toDouble()).toInt()

    for (r in 1..sqrtN) {
        if (N % r == 0) {
            val c = N / r
            if (r <= c) {
                R = r
                C = c
            }
        }
    }

    return Pair(R, C)
}

private fun solution(message: String): String {
    val (R, _) = findRC(message.length)

    val columns = message.chunked(R)

    return (0 until R).joinToString("") { row ->
        columns.joinToString("") { column ->
            column[row].toString()
        }
    }
}

private fun input(): String = readlnOrNull()?.trim() ?: ""

fun main() {
    val message = input()
    println(solution(message))
}