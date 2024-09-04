package falsystack.co.jp.domain.model

import falsystack.co.jp.domain.BaseModel
import falsystack.co.jp.shared.CafeOrderStatus
import falsystack.co.jp.shared.LocalDateTimeSerializer
import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class CafeOrder(
    val orderCode: String,
    val cafeMenuId: Long,
    val cafeUserId: Long,
    val price: Int,
    var status: CafeOrderStatus,
    @Serializable(with = LocalDateTimeSerializer::class)
    val orderedAt: LocalDateTime,
    override var id: Long? = null
) : BaseModel