/**
 * 패션왕 신해빈
 * https://www.acmicpc.net/problem/9375
 */

private val testCase = mutableListOf<Map<String, Int>>()

private fun solution() {
    testCase.forEach {
        var answer = 1

        for (count in it.values) {
            answer *= count + 1
        }
        println(answer - 1)
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()

    repeat(t) {
        val n = readLine().toInt()
        val clothes = mutableMapOf<String, Int>()

        repeat(n) {
            val (_, type) = readLine().split(" ")
            clothes[type] = clothes.getOrDefault(type, 0) + 1
        }
        testCase.add(clothes)
    }

    close()
}

fun main() {
    input()
    solution()
}