/**
 * 회의실 배정
 * https://www.acmicpc.net/problem/1931
 */

data class MeetingTime(
    val start: Int,
    val end: Int
)

private var n = 0
private var reservations = mutableListOf<MeetingTime>()

private fun solution() {
    var numberOfMeetingRoom = 0
    reservations.sortWith(compareBy({ it.end }, { it.start }))

    var answer = 0
    var lastEndTime = 0

    for (reservation in reservations) {
        if (reservation.start >= lastEndTime) {
            answer++
            lastEndTime = reservation.end
        }
    }

    println(answer)
}

private fun input() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()

    repeat(n) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        reservations.add(MeetingTime(start, end))
    }

    close()
}

fun main() {
    input()
    solution()
}