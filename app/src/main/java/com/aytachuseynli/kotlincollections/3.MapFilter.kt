package com.aytachuseynli.kotlincollections

//3)  Find the number of words starting with
//letters in a string and turn it into a map.
//Key should be the letter (String) and Value should be the the result:
//Example String: “If you had one shot, one opportunity,
//to resize everything you have ever wanted one moment would you capture it or let it slip?”


fun main() {
    val inputString = "If you had one shot, one opportunity, to seize everything you have ever wanted one moment would you capture it or let it slip?"

    val wordCountMap = inputString.split("\\s+".toRegex())
        .filter { it.isNotEmpty() && it[0].isLetter() }
        .groupBy { it[0].toString().toLowerCase() }
        .mapValues { it.value.size }

    println("Word Count Map: $wordCountMap")
}
