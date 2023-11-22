package com.aytachuseynli.kotlincollections

//6) You have two lists and a boolean condition. Perform the following:
//- The initial value of the sequence will be 5.
//- If boolean condition is true you should add the First List to the sequence if not the latter.
//- Finally add 10 to the end.
//- Convert the sequence to the list
//
//The given two lists:
//List1: [-1,-2,-3,-4,-5]
//List2: [2,4,6,8,10]

fun main() {
    val list1 = listOf(-1, -2, -3, -4, -5)
    val list2 = listOf(2, 4, 6, 8, 10)
    val condition = true

    val result = sequence {
        yield(5)
        yieldAll(if (condition) list1 else list2)
        yield(10)
    }

    val resultList = result.toList()

    println("Result List: $resultList")
}
