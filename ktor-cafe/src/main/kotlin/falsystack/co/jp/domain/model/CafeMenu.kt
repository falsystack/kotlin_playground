package falsystack.co.jp.domain.model

import falsystack.co.jp.domain.BaseModel
import falsystack.co.jp.shared.CafeMenuCategory
import kotlinx.serialization.Serializable

@Serializable
data class CafeMenu(
    val name: String,
    val price: Int,
    val category: CafeMenuCategory,
    val image: String,
    override var id: Long? = null
): BaseModel