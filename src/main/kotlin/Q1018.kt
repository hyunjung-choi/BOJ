/**
 * 체스판 다시 칠하기
 * https://www.acmicpc.net/problem/1018
 */

private fun compareToChessBoard(startRow: Int, startCol: Int, board: MutableList<CharArray>): Int {
    val patterns = listOf(
        arrayOf("WBWBWBWB", "BWBWBWBW"),
        arrayOf("BWBWBWBW", "WBWBWBWB")
    )

    var minRecolor = Integer.MAX_VALUE

    for (pattern in patterns) {
        var recolorCount = 0
        for (i in 0 until 8) {
            for (j in 0 until 8) {
                if (board[startRow + i][startCol + j] != pattern[i % 2][j]) {
                    recolorCount++
                }
            }
        }
        minRecolor = minRecolor.coerceAtMost(recolorCount)
    }

    return minRecolor
}

private fun solution() {
    val board = input()
    var chessBoard = Integer.MAX_VALUE

    for (i in 0..board.size - 8) {
        for (j in 0..board[0].size - 8) {
            val currentBoard = compareToChessBoard(i, j, board)
            chessBoard = chessBoard.coerceAtMost(currentBoard)
        }
    }

    println(chessBoard)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val (n, _) = readln().split(" ").map { it.toInt() }
    val board = mutableListOf<CharArray>()

    repeat(n) {
        board.add(readln().toCharArray())
    }

    close()
    board
}

fun main() {
    solution()
}