/**
 * 수 정렬하기 2
 * https://www.acmicpc.net/problem/2751
 *
 * println 대신 StringBuilder 를 써야 시간 초과가 안난다!
 */

private var N = 0
private var list = mutableListOf<Int>()
private val sb = StringBuilder()

private fun solution() {
    list = list.sorted().toMutableList()
    for (number in list) {
        sb.append(number).append("\n")
    }
    println(sb.toString())
}

private fun input() = with(System.`in`.bufferedReader()) {
    N = readLine().toInt()

    repeat(N) {
        list.add(readLine().toInt())
    }

    close()
}

fun main() {
    input()
    solution()
}