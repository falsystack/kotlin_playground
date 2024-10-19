package jp.co.falsystack.lang

fun multiple2(block: () -> Int): Int {
    return block() * 2
}

fun main() {
    //val will5: () -> Int = { 5 }
    val will5 = { 5 }
    println(multiple2(will5))


    println(
        multiple2 {
            20
        }
    )
}