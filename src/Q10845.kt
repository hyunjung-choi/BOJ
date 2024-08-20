import java.util.*

/**
 * 큐
 * https://www.acmicpc.net/problem/10845
 */

private val queue = LinkedList<Int>()
private val sb = StringBuilder()

private fun solution() = print(sb.toString())

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val commands = readLine().toString().split(" ")

        when (commands[0]) {
            "push" -> queue.offer(commands[1].toInt())

            "pop" -> sb.append(queue.poll() ?: -1).append("\n")

            "size" -> sb.append(queue.size).append("\n")

            "empty" -> if (queue.isEmpty()) sb.append(1).append("\n") else sb.append(0).append("\n")

            "front" -> sb.append(queue.peek() ?: -1).append("\n")

            "back" -> sb.append(queue.peekLast() ?: -1).append("\n")
        }
    }

    close()
}

fun main() {
    input()
    solution()
}