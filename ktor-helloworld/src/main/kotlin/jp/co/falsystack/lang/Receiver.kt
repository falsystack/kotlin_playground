package jp.co.falsystack.lang

data class Configuration(
    var host: String = "",
    var port: Int = 0
)

// golang 의 메소드랑 비슷
val block2: Configuration.() -> Unit = {
    println("kakao")
}

fun configure(block: Configuration.() -> Unit): Configuration {
    val config = Configuration()
    config.block()
    return config
}

fun main() {
    val config = configure {
        host = "localhost"
        port = 8080
    }
    println(config)
}