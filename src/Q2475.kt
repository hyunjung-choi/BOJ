import java.util.*
import kotlin.math.pow

/**
 * 검증수
 * https://www.acmicpc.net/problem/2475
 */

fun main() {
    val input = Scanner(System.`in`)
    val num01 = input.nextInt().toDouble().pow(2)
    val num02 = input.nextInt().toDouble().pow(2)
    val num03 = input.nextInt().toDouble().pow(2)
    val num04 = input.nextInt().toDouble().pow(2)
    val num05 = input.nextInt().toDouble().pow(2)
    val sum = num01 + num02 + num03 + num04 + num05
    println((sum % 10).toInt())
}