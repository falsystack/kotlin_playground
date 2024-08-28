package com.lannstark.lec04

fun main() {
    // 코틀린에서는 객체에 비교연산자를 사용하면 자동으로 compareTo를 호출 해 준다.

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1 이 Money2 보다 금액이 큽니다.")
    }

    // 동일성, 동등성
    val money3 = JavaMoney(2_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    //
    println(money3 === money4)
    println(money3 == money5)

    println(KotlinMoney(1_000L) + KotlinMoney(2_000L))
}