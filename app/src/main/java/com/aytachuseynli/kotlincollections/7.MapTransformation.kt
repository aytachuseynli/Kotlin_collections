package com.aytachuseynli.kotlincollections

//7) Given the Map perform the following:
//- Make the key uppercase
//- Multiply the value by 3
//
//exampleMap = mapOf("one" to 1, "two" to 2, "three" to 3)


fun main() {
    val exampleMap  = mapOf("one" to 1, "two" to 2, "three" to 3)

    val transformedMap = exampleMap.map { (key, value) ->
        key.toUpperCase() to (value * 3)
    }.toMap()

    println("Transformed Map: $transformedMap")
}