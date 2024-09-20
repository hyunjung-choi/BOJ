/**
 * 제로
 * https://www.acmicpc.net/problem/10773
 */

private val stack = mutableListOf<Int>()

private fun solution() = println(stack.sum())

private fun input() = with(System.`in`.bufferedReader()) {
    val k = readLine().toInt()

    repeat(k) {
        val n = readLine().toInt()

        if (n == 0) stack.removeAt(stack.lastIndex)
        else stack.add(n)
    }

    close()
}

fun main() {
    input()
    solution()
}