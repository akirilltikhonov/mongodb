package com.mongodb.mongodb.domain

data class Recipe(
        val recipeId: Long,
        val title: String,
        val username: String,
        val description: String,
        val instructions: String,
        val servings: Int,
        val ingredients: List<Ingredient> = ArrayList(),
)