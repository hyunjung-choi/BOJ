import java.lang.StringBuilder

/**
 * 팰린드롬수
 * https://www.acmicpc.net/problem/1259
 */

private val answer = StringBuilder()

private fun solution(number: String) {
    if (number.reversed() == number) answer.append("yes\n")
    else answer.append("no\n")
}

private fun input() = with(System.`in`.bufferedReader()) {
    while (true) {
        val number = this.readLine()
        if (number == "0") break
        solution(number)
    }
    this.close()
}

fun main() {
    input()
    println(answer)
}