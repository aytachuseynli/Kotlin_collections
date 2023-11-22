package com.aytachuseynli.kotlincollections

//2) Given a string of words splitted by ",". Turn it into a list in an idiomatic way.
//Example string:
//"hello, world, kotlin, java, android, ios"


fun main() {
    val inputString = "hello, world, kotlin, java, android, ios"
    val wordList = inputString.split(", ").map { it.trim() }

    println("List of words: $wordList")
}
