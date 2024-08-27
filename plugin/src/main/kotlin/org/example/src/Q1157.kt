/**
 * 단어 공부
 * https://www.acmicpc.net/problem/1157
 */

private var word = ""
private var count = 0
private var answer = ""
private val map = mutableMapOf<Char, Int>()

private fun solution() {
    word.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    map.forEach {
        if (count < it.value) {
            count = it.value
            answer = it.key.toString()
        } else if (count == it.value) {
            answer = "?"
        }
    }

    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    word = readLine().toString().uppercase()
    this.close()
}

fun main() {
    input()
    solution()
}