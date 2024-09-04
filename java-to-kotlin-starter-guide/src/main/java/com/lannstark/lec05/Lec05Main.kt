package com.lannstark.lec05

fun validateScoreIsNotNegative(score: Int): Unit {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun validateScoreIsNotNegativeRange(score: Int): Unit {
    if (score !in 0..100) {
        throw IllegalArgumentException("score 의 범위는 0 부터 100 입니다.")
    }
}

fun validateScoreIsNotNegativeRange2(score: Int): Unit {
    if (score in 0..100) {
        throw IllegalArgumentException("score 의 범위는 0 부터 100 입니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) "A"
    else if (score >= 80) "B"
    else if (score >= 70) "C"
    else "kakao"
}

fun getGradeWithSwitch(score: Int): String {
    // 코틀린에는 switch..case 가 없다
    // 대신에 when 이 있다.
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    // when 과 in
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "C"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// 여러 개 조건 동시 검사
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

//
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0 입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수 입니다.")
    }
}