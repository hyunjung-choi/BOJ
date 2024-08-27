import java.util.*

/**
 * 좌표 압축
 * https://www.acmicpc.net/problem/18870
 */

private val coordinateList = mutableListOf<Long>()

private fun solution() {
    val sortedList = coordinateList.toSet().sorted()
    val indexMap = HashMap<Long, Int>()
    val sb = StringBuilder()

    sortedList.forEachIndexed { i, x ->
        indexMap[x] = i
    }

    for (x in coordinateList) {
        sb.append(indexMap[x]).append(" ")
    }

    println(sb.toString())
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    while (st.hasMoreTokens()) {
        coordinateList.add(st.nextToken().toLong())
    }
    close()
}

fun main() {
    input()
    solution()
}