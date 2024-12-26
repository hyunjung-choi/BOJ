/**
 * 팩토리얼 0의 개수
 * https://www.acmicpc.net/problem/1676
 */

private var n = 0

private fun trailingZeros(n: Int): Int {
    var count = 0
    var powerOf5 = 5
    while (n >= powerOf5) {
        count += n / powerOf5
        powerOf5 *= 5
    }
    return count
}

private fun solution() = trailingZeros(n)

private fun input() = with(System.`in`.bufferedReader()) {
    n = readln().toInt()
    close()
}

fun main() {
    input()
    println(solution())
}