package com.aytachuseynli.kotlincollections

//5) Generate a sequence that does the following:
//- Takes an initial value 5
//- Adds 4, then multiplies by 2
//- Makes sure the generated sequence's last value is smaller than 1000


fun main() {
    val sequence = generateSequence(5) { (it + 4) * 2 }
        .takeWhile { it < 1000 }

    println(sequence.toList())
}
