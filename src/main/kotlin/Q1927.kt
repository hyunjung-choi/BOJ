import java.util.*

/**
 * 최소 힙
 * https://www.acmicpc.net/problem/1927
 */

private val list = mutableListOf<Int>()

private fun solution() {
    val minHeap = PriorityQueue<Int>()
    val sb = StringBuilder()
    for (number in list) {
        if (number == 0) {
            if (minHeap.isEmpty()) sb.append(0).append("\n")
            else sb.append(minHeap.poll()).append("\n")
        } else {
            minHeap.add(number)
        }
    }
    println(sb.toString())
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