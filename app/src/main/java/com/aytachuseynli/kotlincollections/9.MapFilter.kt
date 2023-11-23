package com.aytachuseynli.kotlincollections

//9) Given the list of particular data class. Map it into another data class, then filter where the age is between 6-17.
//
//Initial data class Person(val name: String, val age: String, val nationality: String )
//Second data class Student(val name: String, val age: String).

data class Person(val name: String, val age: String, val nationality: String)
data class Student(val name: String, val age: String)

fun main() {
    val persons = listOf(
        Person("Aliye", "10", "Turkish"),
        Person("Bob", "25", "American"),
        Person("Charlie", "15", "British"),
    )

    val students = persons
        .map { Student(it.name, it.age) }
        .filter { it.age.toIntOrNull() in 6..17 }

    println("Filtered Students: $students")
}
