/**
 * 웰컴 키트
 * https://www.acmicpc.net/problem/30802
 */

private fun solution() {
    val (n, sizeList, pair) = input()
    val (t, p) = pair
    val sb = StringBuilder()
    var tShirtCount = 0

    sizeList.forEach { size ->
        tShirtCount += if (size % t == 0) size / t
        else size / t + 1
    }
    val penCount = n / p
    val penOrder = n % p

    sb.append(tShirtCount).append("\n").append(penCount).append(" ").append(penOrder)
    println(sb.toString())
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val sizeList = readLine().split(" ").map { it.toInt() }
    val (t, p) = readLine().split(" ").map { it.toInt() }
    close()
    Triple(n, sizeList, Pair(t, p))
}

fun main() {
    solution()
}