/**
 * 괄호
 * https://www.acmicpc.net/problem/9012
 */

private fun solution(array: Array<String>) {
    for (i in array.indices) {
        val stack = mutableListOf<Char>()
        var isVPS = true
        for (j in array[i].indices) {
            if (array[i][j] == '(') {
                stack.add(array[i][j])
            } else {
                if (stack.isEmpty()) {
                    isVPS = false
                    break
                }
                stack.removeAt(stack.size - 1)
            }
        }
        println(if (isVPS && stack.isEmpty()) "YES" else "NO")
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { readLine() }
    close()
    arr
}

fun main() {
    solution(input())
}