package com.example.lpcoffee

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lpcoffee.databinding.ActivityProductDetailsBinding

class ProductDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val category = intent.getStringExtra("CATEGORY") ?: ""
        binding.textViewProductName.text = "Product Name for $category"
        binding.textViewProductPrice.text = "Product Price"

        binding.buttonAddToCart.setOnClickListener {
            // Lógica para adicionar o produto ao carrinho
        }

        binding.buttonRemoveFromCart.setOnClickListener {
            // Lógica para remover o produto do carrinho
        }

        binding.buttonFinalizePurchase.setOnClickListener {
            // Lógica para finalizar a compra
        }
    }
}
