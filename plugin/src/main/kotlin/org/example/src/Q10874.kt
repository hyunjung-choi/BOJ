/**
 * 이교수님의 시험
 * https://www.acmicpc.net/problem/10874
 */

private val sb = StringBuilder()

private fun solution(answerSheet: Array<Array<Int>>) {
    for (i in answerSheet.indices) {
        var perfect = false
        for (j in 0..9) {
            if (answerSheet[i][j] == makeAnswer(j + 1)) {
                perfect = true
            } else {
                perfect = false
                break
            }
        }
        if (perfect) sb.append(i + 1).append("\n")
    }
    println(sb)
}

private fun makeAnswer(number: Int): Int {
    return ((number - 1) % 5) + 1
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val answerSheet = Array(n) { Array(10) { 0 } }

    for (i in 0 until n) {
        val answers = readLine().split(" ").map { it.toInt() }
        for (j in 0..9) {
            answerSheet[i][j] = answers[j]
        }
    }
    solution(answerSheet)
    close()
}

fun main() {
    input()
}