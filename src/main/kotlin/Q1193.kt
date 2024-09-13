/**
 * 분수찾기
 * https://www.acmicpc.net/problem/1193
 */

private var x = 0

private fun solution() {
    var sum = 0
    var i = 1

    while (sum < x) {
        sum += i
        i++
    }

    val n = i - 1
    val diff = sum - x

    if (n % 2 == 0) println("${n - diff}/${1 + diff}")
    else println("${1 + diff}/${n - diff}")
}

private fun input() = with(System.`in`.bufferedReader()) {
    x = readln().toInt()
    close()
}

fun main() {
    input()
    solution()
}