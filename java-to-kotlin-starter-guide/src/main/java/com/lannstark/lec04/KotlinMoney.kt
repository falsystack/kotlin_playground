package com.lannstark.lec04

data class KotlinMoney(
    val amount: Long
) {
    operator fun plus(otherMoney: KotlinMoney): KotlinMoney {
        return KotlinMoney(amount + otherMoney.amount)
    }
}