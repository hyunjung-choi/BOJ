import java.lang.StringBuilder
import java.util.*

/**
 * 상금 헌터
 * https://www.acmicpc.net/problem/15953
 */

private var T = 0
private var theFirstCodeFestivalGrade = 0
private var theSecondCodeFestivalGrade = 0
private var theFirstCodeFestivalPrize = 0
private var theSecondCodeFestivalPrize = 0
private var st = StringBuilder()

private fun solution() {
    theFirstCodeFestivalPrize = when {
        theFirstCodeFestivalGrade == 0 -> 0
        theFirstCodeFestivalGrade == 1 -> 5000000
        theFirstCodeFestivalGrade <= 3 -> 3000000
        theFirstCodeFestivalGrade <= 6 -> 2000000
        theFirstCodeFestivalGrade <= 10 -> 500000
        theFirstCodeFestivalGrade <= 15 -> 300000
        theFirstCodeFestivalGrade <= 21 -> 100000
        else -> 0
    }
    theSecondCodeFestivalPrize = when {
        theSecondCodeFestivalGrade == 0 -> 0
        theSecondCodeFestivalGrade == 1 -> 5120000
        theSecondCodeFestivalGrade <= 3 -> 2560000
        theSecondCodeFestivalGrade <= 7 -> 1280000
        theSecondCodeFestivalGrade <= 15 -> 640000
        theSecondCodeFestivalGrade <= 31 -> 320000
        else -> 0
    }
    val totalPrize = theFirstCodeFestivalPrize + theSecondCodeFestivalPrize
    st.append(totalPrize).append("\n")
}

private fun input() = with(System.`in`.bufferedReader()) {
    T = readLine().toInt()
    repeat(T) {
        val st = StringTokenizer(readLine())
        theFirstCodeFestivalGrade = st.nextToken().toInt()
        theSecondCodeFestivalGrade = st.nextToken().toInt()
        solution()
    }
    close()
}

fun main() {
    input()
    print(st)
}