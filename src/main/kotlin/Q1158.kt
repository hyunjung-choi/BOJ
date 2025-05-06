/**
 * 요세푸스 문제
 * https://www.acmicpc.net/problem/1158
 */

private fun solution(n: Int, k: Int) {
    val people = ArrayDeque((1..n).toList())
    val result = mutableListOf<Int>()

    var index = 0

    while (people.isNotEmpty()) {
        index = (index + k - 1) % people.size
        result.add(people.removeAt(index))
    }

    println(result.joinToString(prefix = "<", postfix = ">", separator = ", "))
}

private fun input(): Pair<Int, Int> {
    System.`in`.bufferedReader().use { br ->
        val (n, k) = br.readLine().split(" ").map { it.toInt() }
        return Pair(n, k)
    }
}

fun main() {
    val (n, k) = input()
    solution(n, k)
}