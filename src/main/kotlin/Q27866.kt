/**
 * 문자와 문자열
 * https://www.acmicpc.net/problem/27866
 */

private var str = String()
private var i = 0

private fun solution() = println(str[i - 1])

private fun input() {
    System.`in`.bufferedReader().use {
        str = readln()
        i = readln().toInt()
    }
}

fun main() {
    input()
    solution()
}