/**
 * 이번학기 평점은 몇점?
 * https://www.acmicpc.net/problem/2755
 */

private var n = 0
private var totalCredit = 0
private var result = 0.0

private fun computeGrade(credit: Int, grade: Double) {
    totalCredit += credit
    result += credit * grade
}

private fun getGrade(grade: String) = when (grade) {
    "A+" -> 4.3
    "A0" -> 4.0
    "A-" -> 3.7
    "B+" -> 3.3
    "B0" -> 3.0
    "B-" -> 2.7
    "C+" -> 2.3
    "C0" -> 2.0
    "C-" -> 1.7
    "D+" -> 1.3
    "D0" -> 1.0
    "D-" -> 0.7
    else -> 0.0
}

private fun input() = with(System.`in`.bufferedReader()) {
    n = Integer.parseInt(readLine())

    repeat(n) {
        val subjectAndGrade = readLine().split(" ")
        val credit = Integer.parseInt(subjectAndGrade[1])
        val grade = getGrade(subjectAndGrade[2])
        computeGrade(credit, grade)
    }

    this.close()
}

fun main() {
    input()
    println(String.format("%.2f", result / totalCredit))
}