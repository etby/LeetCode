package org.etby.leetcode.easy._20

class Solution {

    var datas = setOf(
            Pair('(', ')'),
            Pair('[', ']'),
            Pair('{', '}')
    )

    fun isValid(s: String): Boolean {
        val list: MutableList<Char> = mutableListOf<Char>()
        s.toCharArray().filter(this::isAvaliableOperator)
                .map {
                    val last = list.lastOrNull()
                    if (last != null && isClose(last, it)) {
                        list.removeAt(list.lastIndex)
                    } else {
                        list.add(it)
                    }
                }

        return list.isEmpty()
    }

    fun isAvaliableOperator(c: Char): Boolean {
        return datas.flatMap { it.toList() }.contains(c)
    }

    fun isClose(left: Char, right: Char): Boolean {
        return when (left) {
            '(' -> right == ')'
            '[' -> right == ']'
            '{' -> right == '}'
            else -> false
        }
    }
}