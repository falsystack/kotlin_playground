package falsystack.co.jp.config

import falsystack.co.jp.shared.CafeOrderStatus
import falsystack.co.jp.shared.dto.OrderDto
import falsystack.co.jp.shared.dto.OrderDto.*
import falsystack.co.jp.shared.menuList
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
                val request = call.receive<CreateRequest>()

                val selectedMenu = menuList.first { it.id == request.menuId }

                val order = DisplayResponse(
                    orderCode = "ordercode1",
                    menuName = selectedMenu.name,
                    customerName = "홍길동",
                    price = selectedMenu.price,
                    status = CafeOrderStatus.READY,
                    orderedAt = LocalDateTime.now(),
                    id = 1
                )

                call.respond(order)
            }
            get("/orders/{orderCode}") {
                val orderCode = call.parameters["orderCode"]!!
                val order = DisplayResponse(
                    orderCode = orderCode,
                    menuName = "아이스라떼",
                    customerName = "홍길동",
                    price = 1000,
                    status = CafeOrderStatus.READY,
                    orderedAt = LocalDateTime.now(),
                    id = 1
                )

                call.respond(order)
            }
        }
    }
}
