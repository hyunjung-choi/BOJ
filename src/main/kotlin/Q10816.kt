/**
 * 숫자 카드 2
 * https://www.acmicpc.net/problem/10816
 */

private lateinit var cards: IntArray
private lateinit var findingCards: List<Int>

private fun solution() {
    val sb = StringBuilder()

    for (findingCard in findingCards) {
        sb.append(cards[findingCard + 10_000_000]).append(" ")
    }

    println(sb.toString())
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readln().toInt()
    cards = IntArray(20_000_001)
    readln().split(" ").forEach { cards[it.toInt() + 10_000_000]++ }
    val m = readln().toInt()
    findingCards = readln().split(" ").map { it.toInt() }
    close()
}

fun main() {
    input()
    solution()
}