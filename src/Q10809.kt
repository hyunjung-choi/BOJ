package kotlinsource

/**
 * 알파벳 찾기
 * https://www.acmicpc.net/problem/10809
 */

private var string: String = ""
private val alphabetList = IntArray(26, { -1 })

private fun solution() {
    for (i in 0 until string.length) {
        if (alphabetList[string.get(i) - 'a'] == -1)
            alphabetList[string.get(i) - 'a'] = i
    }
    println(alphabetList.joinToString(" "))
}

private fun input() = with(System.`in`.bufferedReader()) {
    string = readLine()
    close()
}

fun main() {
    input()
    solution()
}