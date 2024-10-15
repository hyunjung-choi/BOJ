/**
 * 덩치
 * https://www.acmicpc.net/problem/7568
 */

private fun solution() {
    val list = input()
    val rankList = IntArray(list.size) { 1 }

    for (i in list.indices) {
        for (j in list.indices) {
            if (i != j) {
                if (list[i].first < list[j].first && list[i].second < list[j].second) rankList[i]++
            }
        }
    }

    println(rankList.joinToString("\n"))
}

private fun input(): List<Pair<Int, Int>> {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    return List(n) {
        val (weight, height) = reader.readLine().split(" ").map { it.toInt() }
        weight to height
    }
}

fun main() {
    solution()
}