import java.util.*
import kotlin.math.min

/**
 * 회전하는 큐
 * https://www.acmicpc.net/problem/1021
 */

private fun solution() {
    val (n, numbers) = input()
    val queue = LinkedList<Int>()

    repeat(n) {
        queue.offer(it + 1)
    }

    var answer = 0
    for (number in numbers) {
        var count = 0

        while (queue.peek() != number) {
            queue.offer(queue.poll())
            count++
        }

        answer += min(count, queue.size - count)
        queue.poll()
    }

    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val (n, _) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }
    close()
    Pair(n, numbers)
}

fun main() {
    solution()
}