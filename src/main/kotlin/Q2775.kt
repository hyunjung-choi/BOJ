/**
 * 부녀회장이 될 테야
 * https://www.acmicpc.net/problem/2775
 */

private val dp = Array(15) { IntArray(16) }
private val sb = StringBuilder()

private fun initDp() {
    repeat(15) {
        dp[0][it] = it
        dp[it][1] = 1
    }

    for (i in 1 until 15) {
        for (j in 2 until 16) {
            dp[i][j] = dp[i][j - 1] + dp[i - 1][j]
        }
    }
}

private fun calculatePeople(k: Int, n: Int): Int {
    initDp()
    return dp[k][n]
}

private fun input() {
    System.`in`.bufferedReader().use {
        val t = readln().toInt()

        repeat(t) {
            val k = readln().toInt()
            val n = readln().toInt()
            sb.append(calculatePeople(k, n)).append("\n")
        }
    }
}

fun main() {
    input()
    println(sb.toString())
}