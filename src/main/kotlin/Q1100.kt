/**
 * 하얀 칸
 * https://www.acmicpc.net/problem/1100
 */

private var board = Array(8) { BooleanArray(8) }
private var answer = 0

private fun initBoard(): Array<BooleanArray> {
    for (i in 0 until 8) {
        board[i][0] = i % 2 == 0
    }

    for (i in 0 until 8) {
        for (j in 1 until 8) {
            board[i][j] = !board[i][j - 1]
        }
    }

    return board
}

private fun solution() = println(answer)

private fun input() = with(System.`in`.bufferedReader()) {
    board = initBoard()

    repeat(8) { i ->
        val input = readln().toCharArray()
        repeat(8) { j ->
            if (board[i][j] && input[j] == 'F') answer++
        }
    }

    close()
}

fun main() {
    input()
    solution()
}