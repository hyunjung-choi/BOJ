import java.util.*

/**
 * K번째 수
 * https://www.acmicpc.net/problem/11004
 */

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }

    StringTokenizer(readLine()).let { st ->
        val arr = Array(n) { st.nextToken().toInt() }
        arr.sort()
        println(arr[k - 1])
    }
}