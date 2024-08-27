/**
 * 소금과 후추 (Small)
 * https://www.acmicpc.net/problem/14602
 */

private var m = 0
private var n = 0
private var k = 0
private var w = 0
private lateinit var pastaPhoto: Array<IntArray>
private lateinit var result: Array<IntArray>

private fun solution() {
    for (i in 0 until m - w + 1) {
        for (j in 0 until n - w + 1) {
            val window = slidingWindow(i, j, mutableListOf())
            window.sort()
            result[i][j] = window[window.size / 2]
        }
    }
    printArray(result)
}

private fun slidingWindow(i: Int, j: Int, window: MutableList<Int>): MutableList<Int> {
    for (x in 0 until w) {
        for (y in 0 until w) {
            window.add(pastaPhoto[i + x][j + y])
        }
    }
    return window
}

private fun input() = with(System.`in`.bufferedReader()) {
    readLine().split(" ").map { it.toInt() }.apply {
        m = this[0]
        n = this[1]
        k = this[2]
        w = this[3]
    }
    pastaPhoto = Array(m) { IntArray(n) }
    result = Array(m - w + 1) { IntArray(n - w + 1) }

    for (i in pastaPhoto.indices) {
        pastaPhoto[i] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    close()
}

fun main() {
    input()
    solution()
}

private fun printArray(array: Array<IntArray>) {
    val sb = StringBuilder()

    for (row in array) {
        for (element in row) {
            sb.append(element).append(" ")
        }
        sb.append("\n")
    }

    println(sb.toString())
}