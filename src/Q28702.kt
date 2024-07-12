/**
 * Fizz Buzz
 * https://www.acmicpc.net/problem/28702
 */

private const val FIZZ = 3
private const val BUZZ = 5
private const val FIZZBUZZ = 15
private val numbers = mutableListOf<String>()

private fun solution() {
    var pair = Pair(0, 1)

    for ((i, number) in numbers.withIndex()) {
        when (number) {
            "Fizz" -> {
                pair = if (i == 0) Pair(i, FIZZ * pair.second)
                else Pair(i, pair.second + 1)
            }

            "Buzz" -> {
                pair = if (i == 0) Pair(i, BUZZ * pair.second)
                else Pair(i, pair.second + 1)
            }

            "FizzBuzz" -> {
                pair = if (i == 0) Pair(i, FIZZBUZZ * pair.second)
                else Pair(i, pair.second + 1)
            }

            else -> pair = Pair(i, number.toInt())
        }
    }
    println(fizzBuzz(pair.second + 1))
}

private fun fizzBuzz(number: Int): String {
    return if (number % FIZZBUZZ == 0) "FizzBuzz" else if (number % BUZZ == 0) "Buzz" else if (number % FIZZ == 0) "Fizz" else number.toString()
}

private fun input() = with(System.`in`.bufferedReader()) {
    repeat(3) {
        numbers.add(readLine())
    }
    close()
}

fun main() {
    input()
    solution()
}