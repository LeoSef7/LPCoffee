package com.example.lpcoffee

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lpcoffee.databinding.ActivityCategoriesBinding

class CategoriesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCafes.setOnClickListener {
            navigateToProducts("Cafés")
        }
        binding.buttonTortas.setOnClickListener {
            navigateToProducts("Tortas")
        }
    }

    private fun navigateToProducts(category: String) {
        val intent = Intent(this, ProductDetailsActivity::class.java)
        intent.putExtra("CATEGORY", category)
        startActivity(intent)
    }
}
