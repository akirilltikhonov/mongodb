package com.mongodb.mongodb.domain

import com.mongodb.mongodb.domain.enums.Unit

data class Ingredient(
        val ingredientId: Long,
        val value: Float,
        val unit: Unit,
        val type: String,
)