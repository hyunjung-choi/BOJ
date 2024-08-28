/**
 * 두 수의 합
 * https://www.acmicpc.net/problem/3273
 */

fun main() {
    val a = mutableMapOf<Int, Int>()
    val n = readln().let { readln().split(" ").map { it.toInt() } }
    val x = readln().toInt()

    n.forEach { a[it] = a.getOrDefault(it, 0) + 1 }

    println(n.count { it -> a[x - it]?.let { it > 0 } == true } / 2)
}