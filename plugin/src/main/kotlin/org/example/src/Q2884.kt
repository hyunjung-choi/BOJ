import java.util.StringTokenizer

/**
 * 알람 시계
 * https://www.acmicpc.net/problem/2884
 */

private var hour = 0
private var minute = 0

private fun solution() {
    val fortyFiveMinutes = 45
    minute -= fortyFiveMinutes
    if (minute < 0) {
        hour -= 1
        minute += 60
        if (hour < 0) {
            hour += 24
        }
    }

    println("$hour $minute")
}

private fun input() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(this.readLine())
    hour = st.nextToken().toInt()
    minute = st.nextToken().toInt()
    this.close()
}

fun main() {
    input()
    solution()
}