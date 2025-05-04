/**
 * 균형잡힌 세상
 * https://www.acmicpc.net/problem/4949
 */

private val sb = StringBuilder()

private fun solution(s: String): Boolean {
    val stack = ArrayDeque<Char>()

    for (ch in s) {
        when (ch) {
            '(', '[' -> stack.addLast(ch)
            ')' -> {
                if (stack.isEmpty() || stack.removeLast() != '(') return false
            }

            ']' -> {
                if (stack.isEmpty() || stack.removeLast() != '[') return false
            }
        }
    }

    return stack.isEmpty()
}

private fun input() {
    System.`in`.bufferedReader().use {
        while (true) {
            val line = it.readLine()
            if (line == ".") break

            if (solution(line)) sb.append("yes").append("\n") else sb.append("no").append("\n")
        }
    }
}

fun main() {
    input()
    println(sb.toString().trimEnd())
}