/**
 * 해변
 * https://www.acmicpc.net/problem/14397
 */

private fun solution(n: Int, m: Int, map: List<MutableList<Char>>) {
    val directionsOdd = listOf(Pair(-1, 0), Pair(-1, 1), Pair(0, -1), Pair(0, 1), Pair(1, 0), Pair(1, 1))
    val directionsEven = listOf(Pair(-1, -1), Pair(-1, 0), Pair(0, -1), Pair(0, 1), Pair(1, -1), Pair(1, 0))
    var coastline = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == '#') {
                val directions = if (i % 2 == 0) directionsEven else directionsOdd
                for ((di, dj) in directions) {
                    val ni = i + di
                    val nj = j + dj

                    if (ni in 0 until n && nj in 0 until m) {
                        if (map[ni][nj] == '.') coastline++
                    }
                }
            }
        }
    }

    println(coastline)
}

private fun input(): Triple<Int, Int, List<MutableList<Char>>> = with(System.`in`.bufferedReader()) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = MutableList(n) { mutableListOf<Char>() }

    repeat(n) { i ->
        map[i] = readln().toCharArray().toMutableList()
    }

    close()
    Triple(n, m, map)
}

fun main() {
    val (n, m, map) = input()
    solution(n, m, map)
}