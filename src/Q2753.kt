/**
 * 윤년
 * https://www.acmicpc.net/problem/2753
 */

private var year: Int = 0

private fun solution() {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        println(1)
    } else {
        println(0)
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    year = readLine().toInt()
    this.close()
}

fun main() {
    input()
    solution()
}