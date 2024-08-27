/**
 * 행성 정렬
 * https://www.acmicpc.net/problem/25344
 */

private var n = 0
private var list = listOf<Long>()

private fun solution() {
    var lcm = list[0]

    for (i in 1 until list.size) {
        lcm = lcm * list[i] / gcd(lcm, list[i])
    }

    println(lcm)
}

private fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a
    return gcd(b, a % b)
}

private fun input() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    list = readLine().split(" ").map { it.toLong() }
    close()
}

fun main() {
    input()
    solution()
}