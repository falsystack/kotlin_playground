package falsystack.co.jp.domain

import falsystack.co.jp.shared.CafeMenuCategory
import falsystack.co.jp.shared.CafeOrderStatus
import falsystack.co.jp.shared.CafeUserRole
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.javatime.datetime

object CafeMenuTable : LongIdTable(name = "cafe_menu") {
    val name = varchar("menu_name", 50)
    val price = integer("price")
    val category = enumerationByName("category", 10, CafeMenuCategory::class)
    val image = text("image")
}

object CafeUserTable : LongIdTable(name = "cafe_user") {
    val nickname = varchar("nickname", 50)
    val password = varchar("password", 100)
    val roles = enumList("roles", CafeUserRole::class.java, 20)
}

object CafeOrderTable : LongIdTable("cafe_order") {
    val orderCode = varchar("order_code", 50)
    val cafeUserId = reference("cafe_user_id", CafeUserTable)
    val cafeMenuId = reference("cafe_menu_id", CafeMenuTable)
    val price = integer("price")
    val status = enumerationByName("status", 10, CafeOrderStatus::class)
    val orderedAt = datetime(name = "ordered_at")
}