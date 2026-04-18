package com.landt.model

import kotlinx.serialization.Serializable

@Serializable
data class UpdateCartItemRequest(
    val quantity: Int,
    val cartItemId: String
)
