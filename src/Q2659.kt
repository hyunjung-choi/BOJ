import java.lang.Integer.min

/**
 * 십자카드 문제
 * https://www.acmicpc.net/problem/2659
 */

private var card = 0
private var answer = 0

private fun getClockNum(num: Int): Int {
    var temp = num
    var result = num
    repeat(4) {
        temp = temp % 1000 * 10 + temp / 1000
        result = min(result, temp)
    }
    return result
}

private fun solution() {
    for (i in 1111..getClockNum(card)) {
        if (getClockNum(i) == i) answer++
    }
    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    card = readLine().replace(" ", "").toInt()
    close()
}

fun main() {
    input()
    solution()
}