import kotlin.math.max
import kotlin.math.min

/**
 * 걷기
 * https://www.acmicpc.net/problem/1459
 */

private var home = Pair(0L, 0L)
private var w = 0L
private var s = 0L

private fun solution() {
    val (x, y) = home

    val minXY = min(x, y)
    val maxXY = max(x, y)

    // 1. 직선으로만 가는 경우
    val straightOnly = (x + y) * w

    /// 2. 대각선으로 최대한 많이 가는 경우
    val diagonalWithStraight = minXY * s + (maxXY - minXY) * w

    // 3. 대각선으로만 이동 (x + y가 짝수일 때만 가능)
    val diagonalOnly = if ((x + y) % 2 == 0L) maxXY * s else (maxXY - 1) * s + w

    println(minOf(straightOnly, diagonalWithStraight, diagonalOnly))
}

private fun input() = with(System.`in`.bufferedReader()) {
    val (x, y, wValue, sValue) = readln().split(" ").map { it.toLong() }
    home = Pair(x, y)
    w = wValue
    s = sValue
    close()
}

fun main() {
    input()
    solution()
}