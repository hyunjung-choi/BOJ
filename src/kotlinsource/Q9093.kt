package kotlinsource

/**
 *  단어 뒤집기
 *  https://www.acmicpc.net/problem/9093
 */

private var n: Int = 0
private var strList = mutableListOf<String>()

private fun solution() {
    for (sentence in strList) {
        for (str in sentence.split(" ")) {
            print(str
                .reversed()
                .plus(" "))
        }
        println()
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    repeat(n) {
        strList.add(readLine())
    }
    close()
}

fun main() {
    input()
    solution()
}