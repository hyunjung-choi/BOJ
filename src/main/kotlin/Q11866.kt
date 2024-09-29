/**
 * 요세푸스 문제 0
 * https://www.acmicpc.net/problem/11866
 */

private fun solution() {
    val (n, k) = input()
    val sb = StringBuilder("<")
    val deque = ArrayDeque((1..n).toList())

    while (deque.isNotEmpty()) {
        repeat(k - 1) {
            deque.addLast(deque.removeFirst())
        }
        sb.append(deque.removeFirst()).append(", ")
    }

    sb.delete(sb.length - 2, sb.length).append(">")
    println(sb.toString())
}


private fun input() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    close()
    n to k
}

fun main() {
    solution()
}