/**
 * 재귀함수가 뭔가요?
 * https://www.acmicpc.net/problem/17478
 */

fun main() {
    val n = readln().toInt()
    println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    recursive(n, 0)
}

private fun recursive(n: Int, depth: Int) {
    printWithIndent(depth, "\"재귀함수가 뭔가요?\"")

    if (depth == n) printWithIndent(depth, "\"재귀함수는 자기 자신을 호출하는 함수라네\"")
    else {
        printWithIndent(depth, "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.")
        printWithIndent(depth, "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.")
        printWithIndent(depth, "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"")
        recursive(n, depth + 1)
    }

    printWithIndent(depth, "라고 답변하였지.")
}

private fun printWithIndent(depth: Int, string: String) {
    println("${"_".repeat(depth * 4)}$string")
}