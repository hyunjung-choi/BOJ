/**
 * 나이순 정렬
 * https://www.acmicpc.net/problem/10814
 */

private var N = 0
private val members = mutableListOf<Pair<Int, String>>()

private fun solution() {
    members.sortBy { it.first }
    for (member in members) {
        println("${member.first} ${member.second}")
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    N = readLine().toInt()

    repeat(N) {
        val (age, name) = readLine().split(" ")
        members.add(age.toInt() to name)
    }

    close()
}

fun main() {
    input()
    solution()
}