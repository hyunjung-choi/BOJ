import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * 적록색약
 * https://www.acmicpc.net/problem/10026
 */

private fun solution(n: Int, area: Array<CharArray>, isColorWeak: Boolean): Int {
    val visited = Array(n) { BooleanArray(n) }
    var count = 0

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j]) {
                bfs(n, area, visited, i, j, isColorWeak)
                count++
            }
        }
    }

    return count
}

private fun bfs(
    n: Int,
    area: Array<CharArray>,
    visited: Array<BooleanArray>,
    x: Int,
    y: Int,
    isColorWeak: Boolean
) {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(x, y))
    visited[x][y] = true
    val color = area[x][y]

    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)

    while (queue.isNotEmpty()) {
        val (cx, cy) = queue.poll()

        for (dir in 0 until 4) {
            val nx = cx + dx[dir]
            val ny = cy + dy[dir]

            if (nx in 0 until n && ny in 0 until n && !visited[nx][ny]) {
                if (isSameColor(color, area[nx][ny], isColorWeak)) {
                    visited[nx][ny] = true
                    queue.add(Pair(nx, ny))
                }
            }
        }
    }
}

private fun isSameColor(a: Char, b: Char, isColorWeak: Boolean): Boolean {
    return if (isColorWeak) {
        if (a == 'R' || a == 'G') b == 'R' || b == 'G' else a == b
    } else {
        a == b
    }
}

private fun input(): Pair<Int, Array<CharArray>> {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val area = Array(n) { br.readLine().toCharArray() }

    return Pair(n, area)
}

fun main() {
    val (n, area) = input()

    val normalCount = solution(n, area, false)
    val weakCount = solution(n, area, true)

    println("$normalCount $weakCount")
}
