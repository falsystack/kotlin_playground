package com.lannstark.lec03

fun main() {
}

fun printAgeIfPerson(obj: Any?) {
    if (obj is Person) {
        print(obj.age)
    }
}