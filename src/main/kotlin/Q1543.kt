/**
 * 문서 검색
 * https://www.acmicpc.net/problem/1543
 */

private var document = ""
private var word = ""

private fun solution() {
    println(document.split(word).size - 1)
}

private fun input() = with(System.`in`.bufferedReader()) {
    document = readLine().toString()
    word = readLine().toString()
    close()
}

fun main() {
    input()
    solution()
}