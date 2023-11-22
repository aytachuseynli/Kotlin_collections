package com.aytachuseynli.kotlincollections

//4) Create a sublist from the given list from starting index 4 to end index of 8.
//Example list:
//[1,2,3,4,5,6,7,8,9,10,11,12]


fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val subList = list.subList(4, 8)

    println("List: $list")
    println("Sublist: $subList")
}
