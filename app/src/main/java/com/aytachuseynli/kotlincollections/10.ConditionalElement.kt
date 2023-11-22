package com.aytachuseynli.kotlincollections

//10) Find the last element which satisfies the condition in a given list.
//- Condition: The length is smaller or equals to 4.
//- exampleList = ["hello", "world", "kotlin", "java", "android"]

fun main() {
    val list = listOf("hello", "world", "kotlin", "java", "android")

    val lastElement = list.lastOrNull { it.length <= 4 }

    println("Last element with length <= 4: $lastElement")
}
