package kotlinsource

/**
 * 소수 찾기
 * https://www.acmicpc.net/problem/1978
 */

import java.util.*
import kotlin.collections.ArrayList

private var N = 0
private var answer = 0
private var numberList = ArrayList<Int>()

private fun solution() {
    numberList.forEach {
        if (isPrime(it)) answer++
    }
    println(answer)
}

private fun isPrime(number: Int) : Boolean {
    if (number <= 1) return false
    var i = 2
    while (i * i <= number) {
        if (number % i++ == 0) return false
    }
    return true
}

private fun input() = with(System.`in`.bufferedReader()) {
    N = readLine().toInt()
    val st = StringTokenizer(readLine())
    for (i in 0 until N) {
        numberList.add(st.nextToken().toInt())
    }
}

fun main() {
    input()
    solution()
}