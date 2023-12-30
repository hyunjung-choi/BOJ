/**
 * 꼬마 정민
 * https://www.acmicpc.net/problem/11382
 */

private val numbers = mutableListOf<Long>()

private fun solution() {
    var answer = 0L

    repeat(3) {
        answer += numbers[it]
    }

    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val strArr = readLine().split(" ")
    repeat(3) {
        numbers.add(strArr[it].toLong())
    }
    this.close()
}

fun main() {
    input()
    solution()
}