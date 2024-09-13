/**
 * 설탕 배달
 * https://www.acmicpc.net/problem/2839
 */

private fun solution() {
    var n = input()
    var count = 0

    while (n % 5 != 0 && n >= 0) {
        n -= 3
        count++
    }

    if (n < 0) {
        println(-1)
    } else {
        println(count + n / 5)
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    close()
    n
}

fun main() {
    solution()
}