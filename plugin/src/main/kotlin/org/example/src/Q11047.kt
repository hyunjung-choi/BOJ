/**
 * 동전 0
 * https://www.acmicpc.net/problem/11047
 */

private var N = 0
private var K = 0
private val coins = mutableListOf<Int>()

private fun solution() {
    var answer = 0
    for (i in N - 1 downTo 0) {
        if (K < coins[i]) continue
        answer += K / coins[i]
        K %= coins[i]
    }
    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    N = n
    K = k

    repeat(n) {
        coins.add(readLine().toInt())
    }

    close()
}

fun main() {
    input()
    solution()
}