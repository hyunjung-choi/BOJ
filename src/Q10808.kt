import java.lang.StringBuilder

/**
 * 알파벳 개수
 * https://www.acmicpc.net/problem/10808
 */

private var word = ""
private var list = Array(26) {0}
private val sb = StringBuilder()

private fun solution() {
    repeat(word.length) {
        val char = word[it]
        list[(char - 97).code] += 1
    }

    repeat(26) {
        sb.append(list[it]).append(" ")
    }

    println(sb)
}

private fun input() = with(System.`in`.bufferedReader()) {
    word = readLine()
    this.close()
}

fun main() {
    input()
    solution()
}