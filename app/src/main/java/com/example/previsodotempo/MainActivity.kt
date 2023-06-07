package com.example.previsodotempo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isGone
import com.example.previsodotempo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private val binding by lazy { 
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        binding.btnBuscar.setOnClickListener {
            Toast.makeText(this, "Funcionando", Toast.LENGTH_SHORT).show()
        }

    }
}