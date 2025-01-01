/**
 * A + B - C
 * https://www.acmicpc.net/problem/31403
 */

fun main() = List(3) { readln().toInt() }.let { (a, b, c) ->
    println("${a + b - c}\n${"$a$b".toInt() - c}")
}