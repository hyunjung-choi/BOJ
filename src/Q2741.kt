import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * N찍기
 */

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = Integer.parseInt(br.readLine())
    for (i in 1..N) println(i)
}