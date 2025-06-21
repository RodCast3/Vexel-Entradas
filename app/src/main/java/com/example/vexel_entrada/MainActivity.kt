package com.example.vexel_entrada

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnFace: Button
    private lateinit var btnQR: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        btnFace = findViewById(R.id.btnFace)
        btnQR = findViewById(R.id.btnQR)

        btnFace.setOnClickListener {
            intent = Intent(this, AccesoFace::class.java)
            startActivity(intent)

        }
        btnQR.setOnClickListener {
            intent = Intent(this, AccesoQR::class.java)
            startActivity(intent)

        }

    }
}