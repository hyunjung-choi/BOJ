/**
 * X보다 작은 수
 * https://www.acmicpc.net/problem/10871
 */

private val sb: StringBuffer = StringBuffer()

private fun solution(X: Int, list: List<Int>) {
    for (i in list) {
        if (i < X) {
            sb.append(i).append(" ")
        }
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    val (_, X) = readLine().split(" ").map { it.toInt() }
    val list = readLine().split(' ').map { it.toInt() }

    solution(X, list)

    close()
}

fun main() {
    input()
    println(sb)
}