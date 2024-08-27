/**
 * 단어 정렬
 * https://www.acmicpc.net/problem/1181
 */

private fun solution() = with(System.`in`.bufferedReader()) {
    println(
        List<String>(this.readLine().toInt()) {
            this.readLine()
        }.toSet()
            .sortedWith(comparator = compareBy({ it.length }, { it }))
            .joinToString("\n")
    )
    this.close()
}

fun main() {
    solution()
}