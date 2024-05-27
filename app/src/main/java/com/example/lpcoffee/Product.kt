package com.example.lpcoffee

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val category: String,
    val price: Double,
    val ingredients: String
)
