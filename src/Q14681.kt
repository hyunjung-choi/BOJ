/**
 * 사분면 고르기
 * https://www.acmicpc.net/problem/14681
 */

private var x = 0
private var y = 0

private fun solution() = when {
    x > 0 && y > 0 -> println("1")
    x < 0 && y > 0 -> println("2")
    x < 0 && y < 0 -> println("3")
    else -> println("4")
}

private fun input() = with(System.`in`.bufferedReader()) {
    x = Integer.parseInt(readLine())
    y = Integer.parseInt(readLine())
    this.close()
}

fun main() {
    input()
    solution()
}