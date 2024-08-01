/**
 * 1, 2, 3 더하기
 * https://www.acmicpc.net/problem/9095
 */

private val list = mutableListOf<Int>()
private val dp = IntArray(12) { 0 } // 정수 n은 11보다 작으므로 사이즈 12

private fun countWays(n: Int): Int {
    if (n <= 0) return 0

    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    dp[4] = 7

    if (dp[n] != 0) return dp[n]

    for (i in 5..n) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }

    return dp[n]
}

private fun solution() {
    val sb = StringBuilder()

    for (n in list) {
        sb.append(countWays(n)).append("\n")
    }

    println(sb.toString())
}

private fun input() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()

    repeat(testCase) {
        val n = readLine().toInt()
        list.add(n)
    }

    close()
}

fun main() {
    input()
    solution()
}