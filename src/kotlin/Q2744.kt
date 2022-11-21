package kotlin

/**
 * 대소문자 바꾸기
 * https://www.acmicpc.net/problem/2744
 */

private var str = String()

private fun solution(str: String) {
    str.forEach {
        when {
            it.isLowerCase() -> print(it.uppercaseChar())
            it.isUpperCase() -> print(it.lowercaseChar())
        }
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    str = readLine()
}

fun main() {
    input()
    solution(str)
}