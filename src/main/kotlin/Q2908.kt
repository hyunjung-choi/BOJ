/**
 * 상수
 * https://www.acmicpc.net/problem/2908
 */

import java.lang.Math.abs
import java.util.*

private var firstNumber = 0
private var secondNumber = 0

private fun solution(firstNumber: Int, secondNumber: Int): Int {
    val reversedFirstNumber = reverseNumber(firstNumber)
    val reversedSecondNumber = reverseNumber(secondNumber)

    return Math.max(reversedFirstNumber, reversedSecondNumber)
}

private fun reverseNumber(number: Int): Int {
    val sign = Math.signum(number.toDouble()).toInt()
    return abs(number).toString().reversed().toInt() * sign
}

private fun input() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    firstNumber = st.nextToken().toInt()
    secondNumber = st.nextToken().toInt()
}

fun main() {
    input()
    println(solution(firstNumber, secondNumber))
}