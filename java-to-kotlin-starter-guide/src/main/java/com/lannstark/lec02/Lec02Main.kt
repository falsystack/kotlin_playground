package com.lannstark.lec02

fun main() {
    val person = Person("KAKAO")
    // startsWithA4(person.name)

}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String): Boolean {
   return str.startsWith("A")
}