package com.example.config

import com.example.shared.CafeOrderStatus
import com.example.shared.dto.OrderDto
import com.example.shared.menuList
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.time.LocalDateTime


fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        route("/api") {
            get("/menus") {
                val list = menuList
                call.respond(list)
            }
            post("/orders") {
                val request = call.receive<OrderDto.CreateRequest>()

                val selectedMenu = menuList.first { it.id == request.menuId }
                val order = OrderDto.DisplayResponse(
                    orderCode = "orderCode1",
                    menuName = selectedMenu.name,
                    customerName = "Koma",
                    price = selectedMenu.price,
                    status = CafeOrderStatus.READY,
                    orderedAt = LocalDateTime.now(),
                    id = 1
                )
                call.respond(order)
            }
            get("/orders/{orderCode}") {
                val orderCode = call.parameters["orderCode"]!!
                val order = OrderDto.DisplayResponse(
                    orderCode = orderCode,
                    menuName = "아이스레떼",
                    customerName = "Koma",
                    price = 5500,
                    status = CafeOrderStatus.READY,
                    orderedAt = LocalDateTime.now(),
                    id = 1
                )
                call.respond(order)
            }
        }
    }
}
