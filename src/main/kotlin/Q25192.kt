/**
 * 인사성 밝은 곰곰이
 * https://www.acmicpc.net/problem/25192
 */

private var chatroom = mutableListOf<MutableSet<String>>()

private fun solution() {
    var emojies = 0

    for (chat in chatroom) {
        emojies += chat.size
    }

    println(emojies)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val chat = readLine().toString()
        if (chat == "ENTER") {
            chatroom.add(mutableSetOf())
        } else {
            chatroom.last().add(chat)
        }
    }

    close()
}

fun main() {
    input()
    solution()
}