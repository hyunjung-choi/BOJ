package kotlinsource

/**
 * 별 찍기 - 2
 * https://www.acmicpc.net/problem/2439
 */

private var N: Int = 0

private fun solution() {
    for (i in 1..N){
        for (j in 1..N - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    N = readLine().toInt()
    close()
}

fun main() {
    input()
    solution()
}