/**
 * 단어 뒤집기 2
 * https://www.acmicpc.net/problem/17413
 */

private var s = String()

private fun solution() {
    val answer = StringBuilder()
    var isInsideTag = false
    val wordBuffer = StringBuilder()

    for (char in s) {
        when {
            char == '<' -> {
                if (wordBuffer.isNotEmpty()) {
                    answer.append(wordBuffer.reverse())
                    wordBuffer.clear()
                }
                isInsideTag = true
                answer.append(char)
            }

            char == '>' -> {
                isInsideTag = false
                answer.append(char)
            }

            isInsideTag -> {
                answer.append(char)
            }

            char == ' ' -> {
                answer.append(wordBuffer.reverse())
                wordBuffer.clear()
                answer.append(char)
            }

            else -> {
                wordBuffer.append(char)
            }
        }
    }

    if (wordBuffer.isNotEmpty()) {
        answer.append(wordBuffer.reverse())
    }

    println(answer.toString())
}

private fun input() {
    System.`in`.bufferedReader().use {
        s = readln()
    }
}

fun main() {
    input()
    solution()
}