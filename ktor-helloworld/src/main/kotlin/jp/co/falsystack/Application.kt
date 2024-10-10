package jp.co.falsystack

import io.ktor.server.application.*
import jp.co.falsystack.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}
