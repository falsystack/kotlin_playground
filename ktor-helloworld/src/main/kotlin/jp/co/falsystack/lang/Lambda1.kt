package jp.co.falsystack.lang

fun nonLambdaAdd(a: Int, b: Int): Int {
    return a + b
}

val lambdaAdd: (Int, Int) -> Int = { a, b -> a + b }

fun main() {
    val a = 10
    val b = 5
    println(nonLambdaAdd(a, b))
    println(lambdaAdd(a, b))
    println(lambdaAdd.invoke(a,b))
}