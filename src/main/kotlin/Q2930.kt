/**
 * 색종이 만들기
 * https://www.acmicpc.net/problem/2630
 */

private fun solution() {
    val arr = input()
    val n = arr.size
    var white = 0
    var blue = 0

    fun dfs(x: Int, y: Int, size: Int) {
        if (size == 1) {
            if (arr[x][y] == 0) white++
            else blue++
            return
        }

        var isWhite = true
        var isBlue = true
        for (i in x until x + size) {
            for (j in y until y + size) {
                if (arr[i][j] == 1) isWhite = false
                if (arr[i][j] == 0) isBlue = false
            }
        }

        if (isWhite) white++
        else if (isBlue) blue++
        else {
            dfs(x, y, size / 2)
            dfs(x + size / 2, y, size / 2)
            dfs(x, y + size / 2, size / 2)
            dfs(x + size / 2, y + size / 2, size / 2)
        }
    }

    dfs(0, 0, n)
    println(white)
    println(blue)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = Array(n) { readLine().split(" ").map { it.toInt() }.toIntArray() }
    close()
    arr
}

fun main() {
    solution()
}