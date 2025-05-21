import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 문자열 집합
 * https://www.acmicpc.net/problem/14425
 */

private val s = mutableListOf<String>()
private val checkList = mutableListOf<String>()

private fun solution(n: Int, m: Int) {
    var count = 0
    s.sort()

    repeat(m) {
        val target = checkList[it]
        if (binarySearch(s, target)) count++
    }

    println(count)
}

private fun binarySearch(list: List<String>, target: String): Boolean {
    var left = 0
    var right = list.size - 1

    while (left <= right) {
        val mid = (left + right) / 2
        when {
            list[mid] == target -> return true
            list[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return false
}

private fun input(): Pair<Int, Int> {
    BufferedReader(InputStreamReader(System.`in`)).use { br ->
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        repeat(n) {
            s.add(br.readLine())
        }
        repeat(m) {
            checkList.add(br.readLine())
        }
        return Pair(n, m)
    }
}

fun main() {
    val (n, m) = input()
    solution(n, m)
}
