import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 2×n 타일링
 * https://www.acmicpc.net/problem/11726
 */

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val dp = IntArray(n + 1)

    dp[0] = 1
    dp[1] = 1

    for (i in 2..n) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
    }

    println(dp[n])

    br.close()
}