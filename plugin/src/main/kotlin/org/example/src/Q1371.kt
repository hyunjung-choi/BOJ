
/**
 * 가장 많은 글자
 * https://www.acmicpc.net/problem/1371
 */

private fun solution() {
    
}

private fun input() = with(System.`in`.bufferedReader()) {

    val lines = mutableListOf<String>()
    var line = this.readLine()
    val map = HashMap<Char, Int>()

    while (line != null && line.isNotEmpty()) {
        line.iterator().forEach {
            if (it != ' ') map.set(it, map.getOrDefault(it, 0) + 1)
        }
        line = this.readLine()
    }

    println(map)

    this.close()
}

fun main() {
    input()
}