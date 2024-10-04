/**
 * 수 찾기
 * https://www.acmicpc.net/problem/1920
 */

private lateinit var list: Set<Int>
private lateinit var findingNumbers: List<Int>

private fun solution() {
    findingNumbers.map { println(if (list.contains(it)) 1 else 0) }
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    list = readln().split(" ").map { it.toInt() }.toSet()
    val m = readln().toInt()
    findingNumbers = readln().split(" ").map { it.toInt() }
    close()
}

fun main() {
    input()
    solution()
}