import java.util.StringTokenizer

/**
 * 비밀번호 찾기
 * https://www.acmicpc.net/problem/17219
 */

private val passwordMap = mutableMapOf<String, String>()
private val foundList = mutableListOf<String>()
private val answer = StringBuilder()

private fun solution() {
    for (website in foundList) {
        answer.append(passwordMap[website]).append("\n")
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val n = Integer.parseInt(st.nextToken())
    val m = Integer.parseInt(st.nextToken())

    repeat(n) {
        val st = StringTokenizer(readLine())
        passwordMap[st.nextToken()] = st.nextToken()
    }

    repeat(m) {
        foundList.add(readLine())
    }

    this.close()
}

fun main() {
    input()
    solution()
    println(answer)
}