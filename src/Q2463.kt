import java.util.*

/**
 * 색종이
 * https://www.acmicpc.net/problem/2563
 */

private var paper = Array(100) { BooleanArray(100) { false } }
private var number = 0
private val coloredPaperList = mutableListOf<Pair<Int, Int>>()

private fun solution() {
    var area = 0
    attachColoredPaper()

    for (i in 0 until 100) {
        for (j in 0 until 100) {
            if (paper[i][j]) area++
        }
    }

    println(area)
}

private fun attachColoredPaper() {
    for (coloredPaper in coloredPaperList) {
        val x = coloredPaper.first
        val y = coloredPaper.second

        for (i in x until x + 10) {
            for (j in y until y + 10) {
                paper[i][j] = true
            }
        }
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    number = readLine().toInt()

    repeat(number) {
        val st = StringTokenizer(readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()

        coloredPaperList.add(Pair(x, y))
    }

    close()
}

fun main() {
    input()
    solution()
}