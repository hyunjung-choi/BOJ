/**
 * 숫자 정사각형
 * https://www.acmicpc.net/problem/1051
 */

private fun solution(n: Int, m: Int, board: Array<String>) {
    var maxSize = 1

    for (i in 0 until n) {
        for (j in 0 until m) {
            for (len in 1 until minOf(n, m)) {
                val x = i + len
                val y = j + len

                if (x < n && y < m) {
                    val a = board[i][j]
                    val b = board[i][y]
                    val c = board[x][j]
                    val d = board[x][y]

                    if (a == b && a == c && a == d) {
                        val squareSize = (len + 1) * (len + 1)
                        maxSize = maxOf(maxSize, squareSize)
                    }
                }
            }
        }
    }

    println(maxSize)
}

private fun input(): Pair<Array<String>, Pair<Int, Int>> {
    val br = System.`in`.bufferedReader()
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(n) { br.readLine() }

    return board to (n to m)
}

fun main() {
    val (board, size) = input()
    val (n, m) = size
    solution(n, m, board)
}