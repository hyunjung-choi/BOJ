/**
 * 한글 2
 * https://www.acmicpc.net/problem/11283
 */

fun main() {
    val br = System.`in`.bufferedReader()
    val hangul = br.readLine()
    println(hangul[0].code - 44031)
    br.close()
}