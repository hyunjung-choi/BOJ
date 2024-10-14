/**
 * 히오스 프로게이머
 * https://www.acmicpc.net/problem/16564
 */

private fun solution() {
    val (characters, k) = input()

    var left = characters.min()
    var right = characters.max() + k
    var answer = left

    while (left <= right) {
        val mid = (left + right) / 2
        var requireLevels: Long = 0

        for (level in characters) {
            if (level < mid) requireLevels += mid - level
        }

        if (requireLevels <= k) {
            answer = mid
            left = mid + 1
        } else right = mid - 1
    }

    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val (n, k) = readln().split(" ").map { it.toLong() }
    val characters = LongArray(n.toInt())
    repeat(n.toInt()) {
        characters[it] = readln().toLong()
    }
    close()
    Pair(characters, k)
}

fun main() {
    solution()
}