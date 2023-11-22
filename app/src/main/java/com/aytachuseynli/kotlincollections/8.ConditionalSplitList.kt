package com.aytachuseynli.kotlincollections

//8) Given the list and a condition. Partition the list into two lists in a single line using  destructuring.
//If the value is divisible by 2, the list should be named evenList, otherwise oddList.
//Example List:
//[4,5,6,7,8,9,10,11,12,13]

fun main() {
    val numbers = listOf(4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

    val (evenList, oddList) = numbers.partition { it % 2 == 0 }

    println("Even List: $evenList")
    println("Odd List: $oddList")
}

