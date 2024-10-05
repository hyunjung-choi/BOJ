/**
 * 가장 긴 증가하는 부분 수열
 * https://www.acmicpc.net/problem/11053
 */

private fun solution() {
    val (n, nums) = input()
    if (nums.isEmpty()) println(0)

    val dp = Array(n) { 1 }
    var max = 1

    for (i in 1 until n) {
        dp[i] = 1
        for (j in 0 until i) {
            if (nums[j] < nums[i]) dp[i] = dp[i].coerceAtLeast(dp[j] + 1)
        }
        if (dp[i] > max) max = dp[i]
    }

    println(max)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    close()
    Pair(n, nums)
}

fun main() {
    solution()
}