/**
 * 사탕 게임
 * https://www.acmicpc.net/problem/3085
 */

private fun changeCandies(candies: Array<CharArray>): Int {
    var result = 0

    for (i in candies.indices) {
        for (j in candies.indices) {
            // 가로 교환
            if (j + 1 < candies.size) {
                candies[i][j] = candies[i][j + 1].also { candies[i][j + 1] = candies[i][j] }
                result = maxOf(result, maxCandies(candies))
                candies[i][j + 1] = candies[i][j].also { candies[i][j] = candies[i][j + 1] }
            }

            // 세로 교환
            if (i + 1 < candies.size) {
                candies[i][j] = candies[i + 1][j].also { candies[i + 1][j] = candies[i][j] }
                result = maxOf(result, maxCandies(candies))
                candies[i + 1][j] = candies[i][j].also { candies[i][j] = candies[i + 1][j] }
            }
        }
    }
    return result
}

private fun maxCandies(candies: Array<CharArray>): Int {
    var maxCount = 1

    for (i in candies.indices) {
        var rowCount = 1
        var colCount = 1

        for (j in 1 until candies.size) {
            rowCount = if (candies[i][j] == candies[i][j - 1]) rowCount + 1 else 1
            maxCount = maxOf(maxCount, rowCount)

            colCount = if (candies[j][i] == candies[j - 1][i]) colCount + 1 else 1
            maxCount = maxOf(maxCount, colCount)
        }
    }
    return maxCount
}

private fun solution() {
    val candies = input()
    println(changeCandies(candies))
}

private fun input(): Array<CharArray> {
    System.`in`.bufferedReader().use {
        val n = readln().toInt()
        return Array(n) { readln().toCharArray() }
    }
}

fun main() {
    solution()
}