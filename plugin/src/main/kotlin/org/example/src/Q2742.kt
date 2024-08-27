/**
 * 기찍 N
 * https://www.acmicpc.net/problem/2742
 */

private fun solution() {
    for (i in N downTo 1) {
        println(i)
    }
}

private var N: Int = readLine()?.toInt() ?: 0
fun main() {
    solution()
}