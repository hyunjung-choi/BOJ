/**
 * 좋은 단어
 * https://www.acmicpc.net/problem/3986
 */

fun main() = println(List(readln().toInt()) { readln() }.count {
    it.fold(mutableListOf<Char>()) { s, c ->
        if (s.isNotEmpty() && s.last() == c) s.removeAt(s.size - 1) else s.add(c); s
    }.isEmpty()
})