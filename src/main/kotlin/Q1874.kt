/**
 * 스택 수열
 * https://www.acmicpc.net/problem/1874
 */

private val list = mutableListOf<Int>()

private fun solution() {
    val stack = mutableListOf<Int>()
    val result = StringBuilder()
    var index = 0

    for (i in 1..list.size) {
        stack.add(i)
        result.append('+')

        while (stack.isNotEmpty() && stack.last() == list[index]) {
            stack.removeAt(stack.lastIndex)
            result.append('-')
            index++
        }
    }

    if (stack.isNotEmpty()) println("NO")
    else println(result.toString().replace("", "\n").trim())
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        list.add(readLine().toInt())
    }
    close()
}

fun main() {
    input()
    solution()
}