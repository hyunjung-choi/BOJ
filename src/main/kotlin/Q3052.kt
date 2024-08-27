/**
 * 나머지
 * https://www.acmicpc.net/problem/3052
 */

private var number = 0
private val set = mutableSetOf<Int>()

private fun solution() = println(set.size)

private fun getRemainder() = set.add(number % 42)

private fun input() = with(System.`in`.bufferedReader()) {
    repeat(10) {
        number = readLine().toInt()
        getRemainder()
    }
    this.close()
}

fun main() {
    input()
    solution()
}