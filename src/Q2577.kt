/**
 * 숫자의 개수
 * https://www.acmicpc.net/problem/2577
 */

private var A = 0
private var B = 0
private var C = 0

private fun solution() {
    val result = (A * B * C).toString()
    repeat(10) { number -> Int
        val count = result.count { it in number.toString() }
        println(count)
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    A = readLine().toInt()
    B = readLine().toInt()
    C = readLine().toInt()
    this.close()
}

fun main() {
    input()
    solution()
}