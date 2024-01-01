import java.util.StringTokenizer

/**
 * 개수 세기
 * https://www.acmicpc.net/problem/10807
 */

private val numbers = mutableListOf<Int>()
private var n = 0
private var v = 0
private var answer = 0

private fun solution() {
    numbers.forEach { if (it == v) answer += 1 }
    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    n = Integer.parseInt(readLine())
    val st = StringTokenizer(readLine())
    repeat(n) {
        numbers.add(Integer.parseInt(st.nextToken()))
    }
    v = Integer.parseInt(readLine())
    this.close()
}

fun main() {
    input()
    solution()
}