/**
 * 프린터 큐
 * https://www.acmicpc.net/problem/1966
 */

fun main() {
    solution(input())
}

private fun input(): List<Triple<Int, Int, List<Int>>> {
    val testCases = readln().toInt()
    val inputs = mutableListOf<Triple<Int, Int, List<Int>>>()

    repeat(testCases) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        val priorities = readln().split(" ").map { it.toInt() }
        inputs.add(Triple(n, m, priorities))
    }

    return inputs
}

private fun solution(inputs: List<Triple<Int, Int, List<Int>>>) {
    for ((_, m, priorities) in inputs) {
        val queue = ArrayDeque(priorities.mapIndexed { index, priority -> Pair(priority, index) })

        var printOrder = 0

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            if (queue.any { it.first > current.first }) {
                queue.addLast(current)
            } else {
                printOrder++

                if (current.second == m) {
                    println(printOrder)
                    break
                }
            }
        }
    }
}