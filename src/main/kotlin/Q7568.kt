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

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    List(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        x to y
    }
}

fun main() {
    solution()
}