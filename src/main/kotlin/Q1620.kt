/**
 * 나는야 포켓몬 마스터 이다솜
 * https://www.acmicpc.net/problem/1620
 */

private val book = HashMap<Int, String>()
private val reverseBook = HashMap<String, Int>()
private val question = mutableListOf<String>()
private val sb = StringBuilder()

private fun solution() {
    for (q in question) {
        if (q.chars().allMatch { Character.isDigit(it) })
            sb.append(book[q.toInt()]).append("\n")
        else
            sb.append(reverseBook[q]).append("\n")
    }

    println(sb.toString())
}

private fun input() = with(System.`in`.bufferedReader()) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    for (i in 1..n) {
        val name = readln()
        book[i] = name
        reverseBook[name] = i
    }
    repeat(m) {
        question.add(readln())
    }
    close()
}

fun main() {
    input()
    solution()
}