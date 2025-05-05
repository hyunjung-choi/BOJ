/**
 * 계단 오르기
 * https://www.acmicpc.net/problem/2579
 */

private fun solution(n: Int, stairs: IntArray) {
    if (n == 1) {
        println(stairs[1])
        return
    }

    val dp = IntArray(n + 1)

    dp[1] = stairs[1]
    dp[2] = stairs[1] + stairs[2]

    for (i in 3..n) {
        dp[i] = maxOf(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i])
    }

    println(dp[n])
}

private fun input(): Pair<Int, IntArray> {
    System.`in`.bufferedReader().use { br ->
        val n = br.readLine().toInt()
        val stairs = IntArray(n + 1)

        for (i in 1..n) {
            stairs[i] = br.readLine().toInt()
        }

        return Pair(n, stairs)
    }
}

fun main() {
    val (n, stairs) = input()
    solution(n, stairs)
}