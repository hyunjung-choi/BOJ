/**
 * 크로아티아 알파벳
 * https://www.acmicpc.net/problem/2941
 */

private var croatian = ""

private fun solution() {
    val croatianRegex = "c=|c-|dz=|d-|lj|nj|s=|z=".toRegex()
    val replaceCroatian = croatian.replace(croatianRegex, "X")
    println(replaceCroatian.length)
}

private fun input() = with(System.`in`.bufferedReader()) {
    croatian = readLine().toString()
    close()
}

fun main() {
    input()
    solution()
}