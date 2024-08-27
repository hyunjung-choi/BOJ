/**
 * 셀프 넘버
 * https://www.acmicpc.net/problem/4673
 */

private var selfNumberList = mutableListOf<Boolean>()
private val sb = StringBuilder()

private fun d(number: Int) =
    number + number.toString().map {
        it.digitToInt() - '0'.digitToInt()
    }.sum()

private fun initList() = BooleanArray(10001) { true }.toMutableList()

private fun solution() {
    selfNumberList = initList()

    for (i in 1..10000) {
        val result = d(i)
        if (result > 10000) continue
        selfNumberList[result] = false
    }

    for (i in 1..10000) {
        if (selfNumberList[i]) sb.append(i).append("\n")
    }

    println(sb)
}

fun main() {
    solution()
}