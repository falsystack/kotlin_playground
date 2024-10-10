package jp.co.falsystack.lang


fun String.printHello() {
    println("Hello, $this")
}

fun List<Int>.removeEven(): List<Int> {
    return this.filter { it % 2 != 0 }
}

fun main() {
    val s = "world"
    s.printHello() // Hello, world


    val l = listOf(1, 2, 3, 4, 5)
    println(l.removeEven()) // [1, 3, 5]
}