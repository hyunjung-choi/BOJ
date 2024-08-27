import java.util.*

/**
 * 최대 힙
 * https://www.acmicpc.net/problem/11279
 */

private var list = mutableListOf<Int>()

private fun solution() {
    val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder())
    val sb = StringBuilder()

    for (number in list) {
        if (number == 0) {
            if (maxHeap.isEmpty()) sb.append(0).append("\n")
            else sb.append(maxHeap.poll()).append("\n")
        } else {
            maxHeap.add(number)
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