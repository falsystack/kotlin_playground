package falsystack.co.jp.domain.model

import falsystack.co.jp.domain.BaseModel
import falsystack.co.jp.shared.CafeUserRole

data class CafeUser(
    val nickname: String,
    val password: String,
    val roles: List<CafeUserRole>,
    override var id: Long? = null
): BaseModel